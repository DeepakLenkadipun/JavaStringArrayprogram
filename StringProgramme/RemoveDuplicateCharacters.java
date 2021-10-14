package StringProgramme;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String s = "mandadymmy";
//1.create set collection(hashset) and add all the character of given String into set		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));

		}

		for (char ch : set) {
		
			System.out.print(ch );
		}

	}
}
