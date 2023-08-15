package w3resource.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to sort a numeric array and a string array.
				int[] sortNumeric = {2,1,4,7,10,5};
				//Arrays.sort(sortNumeric);
				IntStream sortingStream = Arrays.stream(sortNumeric);
				sortingStream.sorted().forEach(x-> System.out.print(x+" "));
				
				String[] sortStrings = {"Eswar","Bonu","Rao"};
				Stream<String> streamString = Stream.of(sortStrings);
				streamString.sorted().forEach(x->System.out.print(x+" "));
				
		//Write a Java program to sum values of an array.
				
				int[] sumArray = {1,2,4,7,3,1};
				int sum = 0;
				for(int i=0;i<sumArray.length;i++) {
					sum = sum+sumArray[i];
				}
				System.out.println(sum);
				
		//Write a Java program to print the following grid
				for(int i=0; i<10; i++) {
					for(int j=0; j<10;j++) {
						System.out.print("- ");
					}
					System.out.println();
				}
		
		//Write a Java program to calculate the average value of array elements.
				int[] avgArray = {2,4,5,7,8};
				float average=0;
				for(int i=0; i<avgArray.length;i++) {
					average = average+avgArray[i];		
				}
				average = average/avgArray.length;
				System.out.println("Average is : "+average);
				
		//Write a Java program to test if an array contains a specific value.
				int[] newArray = {1,3,5,6,8,9};
				for(int i=0; i<newArray.length;i++) {
					if(newArray[i]==6) {
						System.out.println("Array Contains : "+newArray[i]);
					}
				}
				
		//Write a Java program to remove a specific element from an array.		
				int[] removeElement = {3,6,8,0,1};
				List<int[]> integerList = Arrays.asList(removeElement);
				integerList.remove(1);
				System.out.println("after removing element : "+integerList);
	}

}
