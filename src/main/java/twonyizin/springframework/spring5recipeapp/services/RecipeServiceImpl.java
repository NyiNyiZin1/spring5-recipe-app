package twonyizin.springframework.spring5recipeapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import twonyizin.springframework.spring5recipeapp.domain.Recipe;
import twonyizin.springframework.spring5recipeapp.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
