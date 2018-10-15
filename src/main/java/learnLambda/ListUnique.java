package learnLambda;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class ListUnique {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.forEach((k, v) -> System.out.println(k + "" + v));
		Set<String> ls = new LinkedHashSet<>();
		ls.add("b");
		ls.add("c");
		ls.add("a");
		ls.add("b");
		// ls.forEach(i -> System.out.println(i));
		Stream<String> distinct = ls.stream().distinct();
		distinct.forEach(i -> System.out.println(i));
		Stream<String> sorted = ls.stream().sorted();
		sorted.forEach(i -> System.out.println(i));

	}
}
