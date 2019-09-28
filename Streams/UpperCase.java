package streams;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class UpperCase {

  public static Collection<String> mapToUppercase(String... names) {
      return Stream.of(names)
          .map(name -> name.toUpperCase())
          .collect(toList());
  }
}
