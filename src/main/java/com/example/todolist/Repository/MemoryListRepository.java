package com.example.todolist.Repository;


import com.example.todolist.domain.Todolist;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryListRepository implements ListRepository{
    private static Map<Long, Todolist> store=new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Todolist save(Todolist dolist) {
        dolist.setId(++sequence);
        store.put(dolist.getId(), dolist);
        return dolist;
    }

    @Override
    public List<Todolist> findAll(){return new ArrayList<>(store.values());}

}
