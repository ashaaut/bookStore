package com.example.bookStore.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Book {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")
    private UUID id;

    @Column
    @NotNull
    private  String title;

    @Column
    @NotNull
    private  String description;

    @Column
    @NotNull
    private  int releaseYear;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}


