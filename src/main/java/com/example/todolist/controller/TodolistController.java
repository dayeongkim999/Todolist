package com.example.todolist.controller;

import com.example.todolist.Repository.ListRepository;
import com.example.todolist.domain.Todolist;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TodolistController {
    private final ListRepository listRepository;

    /*
    public Todolist addDolist(@RequestParam("dolist") String dolist){
        Todolist todolist = new Todolist();
        todolist.setDolist(dolist);
        listRepository.save(todolist);
        return todolist;
    }
     */

}
