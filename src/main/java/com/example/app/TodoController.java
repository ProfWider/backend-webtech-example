package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @GetMapping("/todos")
    public List<TodoEntry> greeting() {
        TodoEntry todo1 = new TodoEntry("Buy groceries", "Milk, Cheese, Pizza, Fruit, Tylenol");
        TodoEntry todo2 = new TodoEntry("Buy groceries", "Milk, Cheese, Pizza, Fruit, Tylenol");
        TodoEntry todo3 = new TodoEntry("Buy groceries", "Milk, Cheese, Pizza, Fruit, Tylenol");
        TodoEntry todo4 = new TodoEntry("Buy groceries", "Milk, Cheese, Pizza, Fruit, Tylenol");
        return List.of(todo1, todo2, todo3, todo4);
    }
}
