package com.example.Pigeons.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // oznacza ze inkrementowanie id jest po stronie bazy danych i jest generowane automatycznie nie zaleznie od springa i hiberneta robi to sql
    @Column(name = "role_id") // oznacza jakiej kolumnie odpowiada zmienna
    private int id;

    @Column(name = "role")
    @NotNull
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
