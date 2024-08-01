package com.example.demo.controller; // This is the package where the controller class belongs

import lombok.AllArgsConstructor; // Importing Lombok annotation to generate a constructor with all arguments

import com.example.demo.dto.Dto; // Importing the Data Transfer Object (DTO) for Todo
import com.example.demo.service.*; // Importing the service layer for Todo

import org.springframework.beans.factory.annotation.Autowired; // Importing Spring's @Autowired for dependency injection
import org.springframework.http.HttpStatus; // Importing HttpStatus to set the HTTP response status
import org.springframework.http.ResponseEntity; // Importing ResponseEntity to handle HTTP responses
//import org.springframework.security.access.prepost.PreAuthorize; // Importing security annotations (commented out)
import org.springframework.web.bind.annotation.*; // Importing Spring Web annotations for REST controllers

//import java.util.List; // Importing List from java.util (commented out)

@CrossOrigin("*") // Allowing cross-origin requests from any source
@RestController // Marks the class as a RESTful web service controller
@RequestMapping("api/todos")
// Sets the base URL for all endpoints in this controller
@AllArgsConstructor // Lombok annotation to generate a constructor with all arguments
public class TodoController {

    @Autowired // Automatically injects the TodoService bean into this field
    private service todoService;
    
    // Endpoint to add a new Todo item
    @PostMapping
    public ResponseEntity<Dto> addTodo(@RequestBody Dto todoDto) {
        // Calls the service layer to add a new Todo item and save the returned object
        Dto savedTodo = todoService.addTodo(todoDto);
        
        // Returns the saved Todo item with a 201 Created HTTP status
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }
}