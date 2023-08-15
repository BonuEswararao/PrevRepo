package w3resource.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MuthuQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input = "Hello How are you" output= "Hello - How - are - you"
		String input = "Hello How are you";
		System.out.println(input.replace(" ", " - "));
		
		//Write a program to sum the list integers using streams
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("summing the Numbers : "+sum);
		
		//Write a program to find the duplicates in a list
		List<Integer> duplicateList = Arrays.asList(1,2,3,4,4,5,6);
		duplicateList.stream().filter(i->Collections.frequency(duplicateList, i)>1).collect(Collectors.toSet()).forEach(System.out::println);
	
		//Second Largest Element an an array
		int[] array = {2,3,10,5,6,7};
		Arrays.sort(array);
		System.out.println("Second Largest Element in an Array : "+array[array.length-2]);
	
	}

}
