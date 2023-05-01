package com.example.todolist.Repository;

import com.example.todolist.domain.Todolist;

public interface ListRepository {
    Todolist save(Todolist dolist);

}
