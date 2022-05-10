package com.example.Dutch.Delight.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length =45)
    private String name;

    public Ingredient(String name, Product produs) {
        this.name = name;
        this.produs = produs;
    }

    @ManyToOne
    private Product produs;

    public Product getProdus() {
        return produs;
    }

    public void setProdus(Product produs) {
        this.produs = produs;
    }



    public Ingredient(){}
    public Ingredient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ' ' ;
    }
}
