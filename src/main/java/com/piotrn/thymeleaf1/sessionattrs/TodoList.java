package com.piotrn.thymeleaf1.sessionattrs;

import org.springframework.stereotype.Component;

import java.util.ArrayDeque;

//@SuppressWarnings("serial")
@Component
public class TodoList extends ArrayDeque<TodoItem> {

}
