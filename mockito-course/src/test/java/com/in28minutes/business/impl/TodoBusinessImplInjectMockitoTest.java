package com.in28minutes.business.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import com.in28minutes.data.api.TodoService;
import com.in28miuntes.data.api.TodoServiceStub;

@RunWith(MockitoJUnitRunner.class) // When u mock something we have to use RunWith Annotation
public class TodoBusinessImplInjectMockitoTest {
	
	//@Rule
	//public MockitoRule mockitoRule = MockitoJUnit.rule(); // we can run tests wither with MockitoJunitRunner or using rules. we can configure 
														//	mutiple rules
	
	@Mock
	TodoService todoServiceMock;
	
	@InjectMocks
	TodoBusinessImpl  todoBusinessImpl; // Inject the mocks to the specific class
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl  todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedtoSpring("Eswar");
		assertEquals(2,filteredTodos.size());
	}

	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock() {
		
		List<String> todosList = Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
		when(todoServiceMock.retriveTodos("Eswar")).thenReturn(todosList);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedtoSpring("Eswar");
		assertEquals(2,filteredTodos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock_EmptyList() {
		
		List<String> todosList = Arrays.asList();
		when(todoServiceMock.retriveTodos("Eswar")).thenReturn(todosList);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedtoSpring("Eswar");
		assertEquals(0,filteredTodos.size());
	}
	
	@Test
	public void deleteTodosNotRelatedToSpring() {
		
		List<String> todosList = Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
		when(todoServiceMock.retriveTodos("Eswar")).thenReturn(todosList);
		todoBusinessImpl.DeleteTodosNotRelatedtoSpring("Eswar");
		verify(todoServiceMock, times(1)).deleteTodos("Learn to Dance");
		verify(todoServiceMock).deleteTodos("Learn to Dance");
		verify(todoServiceMock, never()).deleteTodos("Learn Spring"); // never called

	}
	

}
