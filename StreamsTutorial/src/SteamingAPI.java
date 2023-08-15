import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamingAPI {

	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Apple");
		names.add("Aeroplane");
		names.add("Angry");
		names.add("Ball");
		names.add("Baloon");
		
		//names.stream().
		
		// Steaming API will do parallel Operation
		Long count = names.stream().filter(name -> name.startsWith("A")).count();
		System.out.println(count);
		
		Long count1 = Stream.of("Apple","Aeroplane","Angry","Ball","Baloon").filter( name -> name.startsWith("B")).count();
		System.out.println(count1);
		
		names.stream().filter(name -> name.length()>4).forEach(item -> System.out.println(item));
		
		names.stream().filter(name -> name.length()>4).limit(1).forEach(item -> System.out.println(item));
		
		//map to modify the list
		Stream.of("Apple","Aeroplane","Angry","Ball","Baloon").filter(name -> name.endsWith("e")).map(m->m.toUpperCase()).forEach(item->System.out.println(item));
		
		List<String> names1 = Arrays.asList("Apple","Aeroplane","Angry","Ball","Baloon");
		
		names1.stream().filter(name-> name.startsWith("A")).sorted().map(map -> map.toUpperCase()).forEach(item->System.out.println(item));
		
		Stream<String> streamStrings = Stream.concat(names.stream(),names1.stream());
		streamStrings.forEach(item-> System.out.println(item));
		Boolean flag = streamStrings.anyMatch(item->item.equalsIgnoreCase("Adam"));
		
		//create new list from the existing one
		List<String> list = Stream.of("Apple","Aeroplane","Angry","Ball","Baloon").filter(name -> name.endsWith("e")).map(m->m.toUpperCase()).collect(Collectors.toList());
		System.out.println(list.get(1));
		
		List<Integer> lists = Arrays.asList(3,6,710,5,7,7,3);
		lists.stream().distinct().forEach(s->System.out.println(s));
		
	}

}
