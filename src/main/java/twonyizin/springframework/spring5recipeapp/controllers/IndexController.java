package twonyizin.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import twonyizin.springframework.spring5recipeapp.domain.Category;
import twonyizin.springframework.spring5recipeapp.domain.UnitOfMeasure;
import twonyizin.springframework.spring5recipeapp.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {
//    private CategoryRepository categoryRepository;
//    private UnitOfMeasureRepository unitOfMeasureRepository;
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
//        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
//        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
//        System.err.println("Cat Id is: "+categoryOptional.get().getId());
//        System.err.println("UOM Id is: "+unitOfMeasureOptional.get().getId());
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
