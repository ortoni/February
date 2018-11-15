package interviewPre;

import java.util.Arrays;
import java.util.List;

public class Remove {
	static int size;
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ab","ac", "bc", "cd", "ab");
		list.stream().distinct().forEach(i -> System.out.println(i));
		size = list.size();
		for (int j = 0; j < size; j++) {
			if(list.get(j).startsWith("a")) {
				list.remove(list.get(j));
				size = list.size();
			}
		}
	}

}
