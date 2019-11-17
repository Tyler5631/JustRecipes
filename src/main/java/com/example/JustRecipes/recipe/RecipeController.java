package com.example.JustRecipes.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping(RecipeController.URI)
public class RecipeController {
    public static final String URI = "/api/recipes";

    @Autowired
    RecipeRepository recipeRepository;

    @PostMapping
    public @ResponseBody
    Recipe save(@Valid @RequestBody RecipeJSON recipeJSON) {
        Recipe recipe = new Recipe(
                recipeJSON.getAuthor(),
                recipeJSON.getTitle(),
                recipeJSON.getDescription(),
                recipeJSON.getIngredients(),
                recipeJSON.getSteps()
        );
        return this.recipeRepository.save(recipe);
    }
}
