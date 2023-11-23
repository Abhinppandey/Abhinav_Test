package Java;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
	public static void main(String[] args) {
		String names[] = { "Java", "C#", "Java", "Python" };
		Set<String> Store = new HashSet<>();
		for (String name : names) {
			if (Store.add(name) == false) {
				System.out.println("Duplicate elemnt is :" + name);
			}

		}

	}

}
