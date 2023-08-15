package com.in28minutes.business.impl;

import java.util.ArrayList;
import java.util.List;

import com.in28minutes.data.api.TodoService;

//This is the System Under Test
//TodoService could be developed by some other external system. Now we need to stub/ Mock the todoService
public class TodoBusinessImpl {
	
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	List<String> retrieveTodosRelatedtoSpring(String user){
		List<String> filteredTodos = new ArrayList<String>();
		
		List<String> todos = todoService.retriveTodos(user);
		
		for(String todo: todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		
		return filteredTodos;
	}
	
	public void DeleteTodosNotRelatedtoSpring(String user){
		
		List<String> todos = todoService.retriveTodos(user);
		
		for(String todo: todos) {
			if(!todo.contains("Spring")) {
				todoService.deleteTodos(todo);
			}
		}
	}
	

}
