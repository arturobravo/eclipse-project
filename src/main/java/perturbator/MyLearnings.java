package perturbator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class MyLearnings {
	
	private static void streamsTest() {
		List<String> myList = Arrays.asList("","","123","ABC","ZZZ");
		long emptyCount = myList.stream()
							.filter(e -> e.equalsIgnoreCase(""))
							.count();
		
		System.out.println("how many empty elements? -> " + emptyCount);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(14);
//		Stream<Integer> strOfInt = intList.stream();
//		strOfInt.filter(n -> n>2).forEach(n -> System.out.println("number bigger than 2: " + n));
		intList.stream().filter(n -> n>2).forEach(n -> System.out.println("number bigger than 2: " + n));
		
		List<String> intsInString = new ArrayList<>();
		intsInString.add("1");
		intsInString.add("2");
		intsInString.add("3");
		intsInString.add("14");
//		Stream<String> streamofStrings = intsInString.stream();
		List<Integer> intList2 = intsInString.stream().map(n -> Integer.parseInt(n) + 1).collect(Collectors.toList());
		
		intList2.forEach(x -> System.out.println("string transformed plus one: " + x));
		
		
		List<List<Integer>> listOfListOfStrings = new ArrayList<>();
		listOfListOfStrings.add(intList);
		listOfListOfStrings.add(intList2);
		listOfListOfStrings.stream().flatMap(s -> s.stream()).forEach(System.out::println);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		streamsTest();
	}

}
