package twonyizin.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = "recipe")//java.lang.StackOverflowError: null
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob//I think recipeNotes data is the most data
    private String recipeNotes;

}
