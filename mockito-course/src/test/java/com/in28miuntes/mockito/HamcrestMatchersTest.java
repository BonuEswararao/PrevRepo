package com.in28miuntes.mockito;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersTest {

	@Test
	public void test() {
		List<Integer> scores = Arrays.asList(45,89,78,100);
		assertThat(scores, hasSize(4));
		assertThat(scores, hasItems(45,89));
		assertThat(scores, everyItem(greaterThan(40)));
		
		//Strings
		
		assertThat("",isEmptyString());
		assertThat(null,isEmptyOrNullString());
		
		//Arrays
		Integer[] integerArray =  {1,2,4};
		assertThat(integerArray,arrayWithSize(3));
		assertThat(integerArray,arrayContaining(1,2,4));
		assertThat(integerArray,arrayContainingInAnyOrder(2,1,4));
		
		
	}

}
