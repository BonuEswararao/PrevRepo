package com.in28minutes.business.impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoService;
import com.in28miuntes.data.api.TodoServiceStub;

public class TodoBusinessImplTest {
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl  todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedtoSpring("Eswar");
		assertEquals(2,filteredTodos.size());
	}

}
