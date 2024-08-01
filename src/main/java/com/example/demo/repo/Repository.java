package com.example.demo.repo; // This is the package where the repository interface belongs

import com.example.demo.entity.*; // Importing the entity class that will be managed by this repository
import org.springframework.data.jpa.repository.JpaRepository; // Importing Spring Data JPA's JpaRepository interface

// This interface extends JpaRepository to provide CRUD (Create, Read, Update, Delete) operations for the Todo entity
public interface Repository extends JpaRepository<Todo, Long> {
    // JpaRepository provides all the necessary methods for interacting with the Todo table in the database
    // We don't need to write any additional code here for basic CRUD operations
}