package twonyizin.springframework.spring5recipeapp.services;

import twonyizin.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}
