package com.example.todolist.controller;

import com.example.todolist.Repository.ListRepository;
import com.example.todolist.domain.Todolist;
import com.example.todolist.service.ListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TodolistController {
    private final ListRepository listRepository;
    private final ListService listService;

    @PostMapping("list")
    @ResponseBody
    public Todolist addDolist(@RequestParam("dolist") String dolist){
        Todolist todolist = new Todolist();
        todolist.setDolist(dolist);
        listRepository.save(todolist);
        return todolist;
    }
    @GetMapping("list")
    @ResponseBody
    public List<Todolist> getMembers() {
        return listRepository.findAll();
    }


    @GetMapping(value = "/lists/new")
    public String createForm() {
        return "lists/createListForm";
    }


    @PostMapping(value = "/lists/new")
    public String create(ListForm form) {
        Todolist todolist = new Todolist();
        todolist.setDolist(form.getList());
        listService.join(todolist);
        return "redirect:/";
    }

    @GetMapping(value = "/lists")
    public String list(Model model) {
        List<Todolist> lists = listService.findTodolists();
        model.addAttribute("lists", lists);
        return "lists/todolist";
    }

}
