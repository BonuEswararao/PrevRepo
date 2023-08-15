package com.in28minutes.business.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoService;
import com.in28miuntes.data.api.TodoServiceStub;

public class TodoBusinessImplMockTest {
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl  todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedtoSpring("Eswar");
		assertEquals(2,filteredTodos.size());
	}

	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todosList = Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
		when(todoServiceMock.retriveTodos("Eswar")).thenReturn(todosList);
		TodoBusinessImpl  todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedtoSpring("Eswar");
		assertEquals(2,filteredTodos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock_EmptyList() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todosList = Arrays.asList();
		when(todoServiceMock.retriveTodos("Eswar")).thenReturn(todosList);
		TodoBusinessImpl  todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedtoSpring("Eswar");
		assertEquals(0,filteredTodos.size());
	}
	
	@Test
	public void deleteTodosNotRelatedToSpring() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todosList = Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
		when(todoServiceMock.retriveTodos("Eswar")).thenReturn(todosList);
		TodoBusinessImpl  todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		todoBusinessImpl.DeleteTodosNotRelatedtoSpring("Eswar");
		verify(todoServiceMock, times(1)).deleteTodos("Learn to Dance");
		verify(todoServiceMock).deleteTodos("Learn to Dance");
		verify(todoServiceMock, never()).deleteTodos("Learn Spring"); // never called

	}
	

}
