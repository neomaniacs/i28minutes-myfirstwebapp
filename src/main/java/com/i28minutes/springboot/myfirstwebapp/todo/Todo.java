package com.i28minutes.springboot.myfirstwebapp.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private int id ;
    private String username ;

    @Size(min=10, message="Enter at least 10 characters")
    private String description ;
    private LocalDate targetDate ;
    private boolean done ;

    public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
        super() ;
        this.id = id ;
        this.username = username ;
        this.description = description ;
        this.targetDate = targetDate ;
        this.done = done ;
    }

    public Todo() {

    }


    public void setId(int id) {
        this.id = id ;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDescription(String description) {
        this.description = description ;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate ;
    }

    public void setDone(boolean done) {
        this.done = done ;
    }

    public int getId() {
        return this.id ;
    }

    public String getUsername() {
        return this.username ;
    }

    public String getDescription() {
        return this.description ;
    }

    public LocalDate getTargetDate() {
        return this.targetDate ;
    }

    public boolean getDone() {
        return this.done ;
    }

}
