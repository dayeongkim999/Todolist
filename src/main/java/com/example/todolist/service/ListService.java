package com.example.todolist.service;

import com.example.todolist.Repository.ListRepository;
import com.example.todolist.Repository.MemoryListRepository;
import com.example.todolist.domain.Todolist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService {
    private final ListRepository listRepository = new MemoryListRepository();
    //할 일 추가
    public Long join(Todolist todolist){
        listRepository.save(todolist);
        return todolist.getId();
    }

    //할 일 조회
    public List<Todolist> findTodolists(){return listRepository.findAll();}

}
