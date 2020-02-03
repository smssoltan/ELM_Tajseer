package com.Elm.Tajseer.Tajseer.Model;

import javax.persistence.*;
import java.util.Set;

@Entity //User Entity
@Table(name = "Classes")
public class Class {

    @Id         //Prime key column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @ManyToMany
    Set<Class>  takenClasses;

    public Class(){}

    public Class(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
}
