package twonyizin.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipes"})//java.lang.StackOverflowError: null
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    //do not want to create table(mappedBy = "categories")
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;


}
