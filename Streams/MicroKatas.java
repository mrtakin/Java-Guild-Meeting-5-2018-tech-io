package streams;

import java.util.*;

import static java.util.stream.Collectors.*;

public class MicroKatas {
  public static List<String> transform(List<List<String>> collection) {
  	return collection.stream()
  	    .flatMap(c -> c.stream())
  	    .collect(toList());
  }

  public static Person getOldestPerson(List<Person> people) {
		return people.stream()
		    .max(Comparator.comparing(Person::getAge))
		    .get();
	}

  public static int calculate(List<Integer> numbers) {
		return numbers.stream().reduce(0, (total, curr) -> total + curr);
	}

  public static Set<String> getKidNames(List<Person> people) {
		return people.stream()
		    .filter(p -> p.getAge() < 18)
		    .map(Person::getName)
		    .collect(toSet());
	}

  public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
		return people.stream()
		    .collect(partitioningBy(p -> p.getAge() >= 18));
	}

  public static Map<String, List<Person>> groupByNationality(List<Person> people) {
		return people.stream()
		    .collect(groupingBy(Person::getNationality));
	}

  public static String namesToString(List<Person> people) {
		return people.stream()
		    .map(Person::getName)
		    .collect(joining(", ", "Names: ", "."));
	}

  public static String getString(List<Integer> list) {
  	return list.stream()
      	    .map(i -> (i % 2 == 0) ? "e" + i : "o" + i)
      	    .collect(joining(","));
  }
}
