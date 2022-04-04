package com.example.FishAtlas.repositories;

import com.example.FishAtlas.domain.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, Integer> {
}
