package Java;

import java.util.Map;
import java.util.Set;

public class hashmap1 {
	public static void main(String[] args) {
		Map<String, Integer> phonebook = new java.util.HashMap<>();
		phonebook.put("Abhinav", 9900);
		phonebook.put("Ram", 9910);
		phonebook.put("Lakshman", 9911);

		System.out.println(phonebook.get("Abhinav"));
		Set<String> Keys=phonebook.keySet();
		for (String string : Keys) {
			System.out.println(string+"-->"+phonebook.get(string));
		}
		

	}

}
