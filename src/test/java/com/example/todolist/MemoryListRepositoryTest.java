package com.example.todolist;

import com.example.todolist.Repository.MemoryListRepository;
import com.example.todolist.domain.Todolist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
public class MemoryListRepositoryTest {
    MemoryListRepository repository = new MemoryListRepository();

    @Test
    public void save() {
        Todolist todo1 = new Todolist();
        todo1.setDolist("밥먹기");
        repository.save(todo1);
        Todolist result = (Todolist) repository.findAll();
        Assertions.assertEquals(result, result);
    }
    }