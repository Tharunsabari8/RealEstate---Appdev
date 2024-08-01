package com.example.demo.service.impl;

import lombok.AllArgsConstructor;
import com.example.demo.dto.*;
import com.example.demo.entity.*;
import com.example.demo.repo.Repository;
import com.example.demo.repo.*;
import com.example.demo.service.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

//import java.util.List;
//import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class serviceimpl implements service {

    private Repository Repository;

    private ModelMapper modelMapper;

    @Override
    public Dto addTodo(Dto todoDto) {

        // convert TodoDto into Todo Jpa entity
        Todo todo = modelMapper.map(todoDto, Todo.class);

        // Todo Jpa entity
        Todo savedTodo = Repository.save(todo);

        // Convert saved Todo Jpa entity object into TodoDto object

        Dto savedTodoDto = modelMapper.map(savedTodo,Dto.class);

        return savedTodoDto;
    }
    
}
