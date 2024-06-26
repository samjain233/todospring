package com.webdev.todo.todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todoIndex;
	
	static {
		todos.add(new Todo(++todoIndex, "in28minutes","Learn AWS", 
							LocalDate.now().plusYears(1), false ));
		todos.add(new Todo(++todoIndex, "in28minutes","Learn DevOps", 
				LocalDate.now().plusYears(2), false ));
		todos.add(new Todo(++todoIndex, "in28minutes","Learn Full Stack Development", 
				LocalDate.now().plusYears(3), false ));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String description) {
		todos.add(new Todo(++todoIndex ,"sambhav",description,LocalDate.now().plusYears(1),false));
		return;
	}
}