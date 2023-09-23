package com.i28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>() ;
    static {
        todos.add(new Todo(1, "in28minutes", "Learn AWS", 
        LocalDate.now().plusDays(1), false)) ;
        todos.add(new Todo(2, "in28minutes", "Learn DevOps", 
        LocalDate.now().plusDays(2), false)) ;
        todos.add(new Todo(3, "in28minutes", "Learn FullStack Development", 
        LocalDate.now().plusDays(3), false)) ;
    }

    public List<Todo> findByUsername(String username) {
        return todos ;
    }
    
}
