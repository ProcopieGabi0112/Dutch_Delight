package com.example.Dutch.Delight.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length =45)
    private String name;
    @Column(nullable = false, unique = true, length =45)
    private int price;

    @ManyToOne
    private Category categorie;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @OneToMany(mappedBy = "produs")
    private List<Ingredient> ingredients;

    public Product(){ }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {  return " " + name+ "(" + price + "lei)"+"\n";  }
}
