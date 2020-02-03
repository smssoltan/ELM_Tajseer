package com.Elm.Tajseer.Tajseer.Model;

import javax.persistence.*;
import java.util.Set;

@Entity //User Entity
@Table(name = "Students")
public class Student {
    @Id         //Prime key column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @ManyToMany
    Set<Class> isTaking;

    public Student(){ // Hibernate requires a no-arg constructor


    }
    public Student(int id, String name) {
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
