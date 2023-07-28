package com.example.recipemanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Recipe {
    @Id
    private  Integer RecId;
   private String name;
    private String ingredients;
    private String instructions;
    @OneToOne
    @JoinColumn(name = "fk_user_emailId")
    User user;

}
