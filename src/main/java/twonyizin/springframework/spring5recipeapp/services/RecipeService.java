package twonyizin.springframework.spring5recipeapp.services;

import org.springframework.stereotype.Service;
import twonyizin.springframework.spring5recipeapp.domain.Recipe;

@Service
public interface RecipeService {

    Recipe getRecipes();
}
