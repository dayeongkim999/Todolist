package com.example.todolist.Repository;

import com.example.todolist.domain.Todolist;

import java.util.List;

public interface ListRepository {
    Todolist save(Todolist dolist);
    List<Todolist> findAll();

}
