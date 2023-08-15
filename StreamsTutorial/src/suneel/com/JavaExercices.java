package suneel.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaExercices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse a given string or number
		String s = "I am doing good";
		
//		StringBuilder stb = new StringBuilder();
//		stb.append(s);
//		StringBuilder result = stb.reverse();
//		System.out.println(result);
		
//		StringBuffer stb = new StringBuffer(s);
//		System.out.println(stb.reverse());
		
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
		
//		int length = s.length();
//		while(length>0) {
//			System.out.print(s.charAt(length-1));
//			length--;
//		}

		
		//Find the duplicate numbers from given array
		int[] array = {1,3,3,7,8,8,9};
		
//		List<Integer> list = Arrays.asList(1,3,3,7,8,8,9);
//		Set<Integer> duplicate = list.stream().filter(i->Collections.frequency(list, i)>1).collect(Collectors.toSet());
//		System.out.println(duplicate.toString());
		
//		for(int i=0; i<array.length; i++) {
//			for(int j=i+1; j<array.length;j++) {
//				if(array[i]==array[j]) {
//					System.out.println(array[i]);
//				}
//			}
//		}
		
		//Remove duplicate numbers
		int[] duplicateNumbers = {4,4,5,6,7,8,6,2,1,6,7,8};		
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//		for(int number : duplicateNumbers) {
//			set.add(number);
//		}
//		System.out.println(set.toString());
		
//		List<Integer> list = Arrays.asList(4,4,5,6,7,8,6,2,1,6,7,8);
//		Set<Integer> duplicatesRemoval = list.stream().collect(Collectors.toSet());
//		System.out.println(duplicatesRemoval.toString());
		
		
		//Remove duplicates from a character Array
//		String name= "Eswararao";
//		char ch[] = name.toCharArray();
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		for(Character character : ch) {
//			set.add(character);
//		}
//		System.out.println(set.toString());
		
	    //Print a Triangular Pattern
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		} 
		
		//Print the occurances of each character in the given string
//		String name = "Eswararao";
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		for(int i=0; i<name.length(); i++) {
//			int count =0;
//			for(int j=0; j<=i; j++) {
//				if(name.charAt(i)==name.charAt(j)) {
//					count++;
//				}
//			}		
//			map.put(name.charAt(i), count);
//		}
//		System.out.println(map.toString());
		
		//Java program to find the duplicate words in the given string
//		String duplicateWords = "Java is a Programming Language Python is also a Programming Language";
//		String[] words = duplicateWords.split(" ");
//		List<String> stringList = new ArrayList<String>();
//		for(String word: words) {
//			stringList.add(word);
//		}
//		
//		Set<String> repeatedWords = stringList.stream().filter(i->Collections.frequency(stringList, i)>1).collect(Collectors.toSet());
//		System.out.println(repeatedWords.toString());
		
		
	
	}

}
