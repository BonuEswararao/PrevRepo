package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Counting Empty String
		List<String> emptyStrings = Arrays.asList("abcd", "", "def", "", "ij");
		long count = emptyStrings.stream().filter(x -> x.isEmpty()).count();
		System.out.println("count of empty strings are : " + count);

		// Count String whose length is more than three

		long lenthMoreThanThree = emptyStrings.stream().filter(x -> x.length() > 3).count();
		System.out.println("Count of Strings whose length is More than Three : " + lenthMoreThanThree);

		// Count number of String which starts with "a"

		long letterStartsWith_A = emptyStrings.stream().filter(x -> x.startsWith("a")).count();
		System.out.println("Count number of String which starts with \"a\" : " + letterStartsWith_A);

		// Remove all empty Strings from List

		List<String> removeEmptyStrings = emptyStrings.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println("Remove all empty Strings from List : " + removeEmptyStrings.toString());

		// Create a List with String more than 2 characters
		List<String> listWithMoreThan2Strings = emptyStrings.stream().filter(x -> x.length() > 2)
				.collect(Collectors.toList());
		System.out.println("Create a List with String more than 2 characters : " + listWithMoreThan2Strings.toString());

		// Map functional Example: Convert String to uppercase and Join them with coma
		List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		String g7Countries = countries.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println("Convert String to uppercase and Join them with coma : " + g7Countries);

		// Create a List of the square of all distinct numbers
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 6);
		List<Integer> squaringDistinct = integers.stream().map(x -> x * x).distinct().collect(Collectors.toList());
		System.out.println("Create a List of the square of all distinct numbers : " + squaringDistinct.toString());

		// getting minimum number in a list
		Optional<Integer> miniumNumber = integers.stream().sorted().findFirst();
		System.out.println("Minimum Integer Number is : " + miniumNumber);

		// getting maximum number in a list
		int maximumNumber = integers.stream().max(Integer::compare).get();
		System.out.println("maximum Integer Number is : " + maximumNumber);
		
		
	}

}
