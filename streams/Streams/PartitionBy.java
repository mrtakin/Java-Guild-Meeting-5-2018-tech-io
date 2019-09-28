package streams;

import java.util.*;

import static java.util.stream.Collectors.*;

public class PartitionBy {

	public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
		return people.stream()
		    .collect(partitioningBy(p -> p.getAge() >= 18));
	}
}
