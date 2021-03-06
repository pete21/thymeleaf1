package com.piotrn.thymeleaf1.sessionattrs;

import java.time.LocalDateTime;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/scopedproxy")
public class TodoControllerWithScopedProxy {

    private final TodoList todos;

    @GetMapping("/form")
    public String showForm(Model model) {
        if (!todos.isEmpty()) {
            model.addAttribute("todo", todos.peekLast());
        } else {
            model.addAttribute("todo", new TodoItem());
        }

        return "sessionattrs/scopedproxyform";
    }

    @PostMapping("/form")
    public String create(@ModelAttribute TodoItem todo) {
        todo.setCreateDate(LocalDateTime.now());
        todos.add(todo);
        return "redirect:/scopedproxy/todos.html";
    }

    @GetMapping("/todos.html")
    public String list(Model model) {
        model.addAttribute("todos", todos);
        return "sessionattrs/scopedproxytodos";
    }
}
