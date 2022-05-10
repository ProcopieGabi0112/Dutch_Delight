package com.example.Dutch.Delight.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="tables")
public class Masa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private Long number;

    @OneToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="tables_products",joinColumns = @JoinColumn(name="table_id"),inverseJoinColumns = @JoinColumn(name="product_id"))
    private Set<Product> products = new HashSet<>();

    public Masa(Long number, User user, Set<Product> products) {
        this.number = number;
        this.user = user;
        this.products = products;
    }
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Masa(){ }
    public Masa(Long number) {
        this.number = number;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Masa " + number +" ";
    }
}
