package StringProgramme;

import java.util.HashSet;

public class OccuranceOfCharacterinString {
	public static void main(String[] args) {
		String s = "mandadymmy";
//1.create set collection(hashset) and add all the character of given String into set		
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));

		}
//2.Compare each character of set with all character of given string
		for (char ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch + " " + count);
		}

	}

}
