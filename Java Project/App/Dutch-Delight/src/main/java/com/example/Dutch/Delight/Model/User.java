package com.example.Dutch.Delight.Model;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length =45)
    private String email;
    @Column(nullable=false, length=64)
    private String password;
    @Column(nullable=false, length=20)
    private String firstName;
    @Column(nullable=false, length=20)
    private String lastName;


    @OneToOne
    private Masa masa;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="users_roles",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role> roles = new HashSet<>();

    public void setMasa(Masa masa) {this.masa = masa; }
    public Masa getMasa() { return masa; }
    public Set<Role> getRoles() { return roles; }
    public void setRoles(Set<Role> roles) { this.roles = roles;}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getPassword() {return password;}
    public void setPassword(String password) { this.password = password;}

    public void addRole(Role role){
        this.roles.add(role);
    }

    public boolean hasRole(String roleName){
        Iterator<Role> iterator = roles.iterator();

        while(iterator.hasNext())
        {
            Role role = iterator.next();
            if(role.getName().equals(roleName)) { return true; }
        }
        return false;
    }
}
