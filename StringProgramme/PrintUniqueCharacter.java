package StringProgramme;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String s = "manndaaday";
//1.create set collection(hashset) and add all the character of given String into set
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
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
//3.remove all duplicates			
			if(count==1) {
				
			System.out.print(ch +" ");
		}

	}
}
}
