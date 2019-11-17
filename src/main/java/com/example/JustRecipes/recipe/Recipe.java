package com.example.JustRecipes.recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;
    private String author;
    private String title;
    private String description;
    private String ingredients;
    private String steps;

    public Recipe(String author, String title, String description, String ingredients, String steps) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.steps = steps;
    }
}
