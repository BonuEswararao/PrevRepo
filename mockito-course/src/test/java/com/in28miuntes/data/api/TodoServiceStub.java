package com.in28miuntes.data.api;

import java.util.Arrays;
import java.util.List;

import com.in28minutes.data.api.TodoService;

public class TodoServiceStub implements TodoService{

	public List<String> retriveTodos(String user) {
		// TODO Auto-generated method stub
		
		return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
	}

	public void deleteTodos(String todo) {
		// TODO Auto-generated method stub
		
	}

}
