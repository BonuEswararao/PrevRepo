package com.in28minutes.data.api;

import java.util.List;

public interface TodoService {
	
	List<String> retriveTodos(String user);
	
	public void deleteTodos(String todo);

}
