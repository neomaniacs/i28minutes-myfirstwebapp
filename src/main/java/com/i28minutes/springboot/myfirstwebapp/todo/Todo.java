package com.i28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

public class Todo {
    private int id ;
    private String username ;
    private String description ;
    private LocalDate targetDate ;
    private boolean done ;

    public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
        this.id = id ;
        this.username = username ;
        this.description = description ;
        this.targetDate = targetDate ;
        this.done = done ;
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
