package com.example.Pigeons.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity  //dzieki temu hibernate bedzie wiedzil ze jest to encja czyli odpowiednik czegos w bazie danych
@Table(name = "user") // hibernite bedzie wiedzial ktora tablica ma sie poslugiwac
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // oznacza ze inkrementowanie id jest po stronie bazy danych i jest generowane automatycznie nie zaleznie od springa i hiberneta robi to sql
    @Column(name = "user_id") // oznacza jakiej kolumnie odpowiada zmienna
    private int id;

    @Column(name = "email")
    @NotNull //validacje jest to
    private String email;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "last_name")
    @NotNull
    private String lastName;

    @Column(name = "active")
    @NotNull
    private int active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id")) //pobiera user_id i role_id i wsadza do tablicy user_role
    private Set<Role> roles;


    @Transient //oznacza ze jest ona tylko dla nas pomocnicza i bedzie pomijana przy zapisie do bazy
    private String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
