package com.in28miuntes.mockito;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;

import java.util.List;

import org.junit.Test;


public class ListTest {

	@Test
	public void listMockSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
	}
	
	@Test
	public void listMockSize_ReturnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2,listMock.size());
		assertEquals(3,listMock.size());
	}
	
	@Test
	public void listMockListGet() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("in28Minutes");
		assertEquals("in28Minutes",listMock.get(0));
		assertNull(listMock.get(1));
	}
	
	@Test
	public void listMockanyInteger() {
		List listMock = mock(List.class);
		//argument Matchers
		when(listMock.get(anyInt())).thenReturn("in28Minutes");
		assertEquals("in28Minutes",listMock.get(0));
		assertEquals("in28Minutes",listMock.get(1));
	}
	
	@Test(expected = RuntimeException.class)
	public void listMock_ThrowException() {
		List listMock = mock(List.class);
		//argument Matchers
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Exception"));
		listMock.get(0);
	}
	
	@Test
	public void listMockListGet_BDD() {
		//Given
		List listMock = mock(List.class);
		given(listMock.get(anyInt())).willReturn("in28Minutes");
		//When
		listMock.get(0);
		//Then
		//assertThat(listMock.get(0),is("in28Minutes"));
	}

}
