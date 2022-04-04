package com.example.FishAtlas.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "fishes")
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String number;
    private String period;
    private String dimension;

    public Fish(String name, String limit, String period, String dimension) {
        this.name = name;
        this.number = limit;
        this.period = period;
        this.dimension = dimension;
    }
}
