package com.in28minutes.powermock;

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
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.in28minutes.data.api.TodoService;
import com.in28miuntes.data.api.TodoServiceStub;

@RunWith(PowerMockRunner.class) // When u mock something we have to use RunWith Annotation
@PrepareForTest(UtilityClass.class)
public class MockingStaticMethodTest {
	
	//Specific runner
	//Initialize UtilityClass.class
	//mock
		
	@Mock
	Dependency dependency;
	
	@InjectMocks
	SystemUnderTest  systemUnderTest; // Inject the mocks to the specific class
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock() {
		
		List<Integer> stats = Arrays.asList(1,3,5);
		when(dependency.retrieveAllStats()).thenReturn(stats);
		PowerMockito.mockStatic(UtilityClass.class);
		when(UtilityClass.staticMethod(6)).thenReturn(150);
		int result = systemUnderTest.methodCallingAStaticMethod();
		assertEquals(150,result);
		
		//To verify whether its really called
		PowerMockito.verifyStatic();
		UtilityClass.staticMethod(6);
	}
	

}
