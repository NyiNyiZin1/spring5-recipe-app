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

    @Lob
    private String recipeNotes;

}

