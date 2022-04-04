package com.example.FishAtlas;

import com.example.FishAtlas.repositories.FishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private final String title = "Test page";

    @Autowired
    private FishRepository fishRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title", title);
        model.addAttribute("fishes", fishRepository.findAll());
        return "index";
    }

    @GetMapping("/fish/view/{id}")
    public String singleFishView(@PathVariable("id") int id, Model model){
        model.addAttribute("title", title);
        model.addAttribute("fish", fishRepository.findById(id).get());
        return "fish/view";
    }

    @GetMapping("/home")
    public String home(Model model,
                       @RequestParam(value = "name",
                               required = false,
                       defaultValue = "Guest") String name){
        model.addAttribute("name", name);
        model.addAttribute("title", title);
        return "home";
    }
}
