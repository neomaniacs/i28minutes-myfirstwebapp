package com.i28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int countTodos = 0;

    static {
        todos.add(new Todo(++countTodos, "in28minutes", "Get AWS Certified 1",
                LocalDate.now().plusDays(1), false));
        todos.add(new Todo(++countTodos, "in28minutes", "Learn DevOps 1",
                LocalDate.now().plusDays(2), false));
        todos.add(new Todo(++countTodos, "in28minutes", "Learn FullStack Development 1",
                LocalDate.now().plusDays(3), false));
    }

    public List<Todo> findByUsername(String username) {
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++countTodos, username, description, targetDate, done) ;
        todos.add(todo) ;
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate) ;
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo =  todos.stream().filter(predicate).findFirst().get() ;
        return todo ;
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo) ;
    }

}
