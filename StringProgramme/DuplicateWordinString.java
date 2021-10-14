package StringProgramme;

import java.util.HashSet;

public class DuplicateWordinString {
	
		public static void main(String[] args) {
			String s = "man is common man is  ";
	//converting string to string array by split method		
			String [] s1=s.split(" ");
	//create set collection(hashset) and add all the word of given String into set		
			HashSet<String> set = new HashSet<String>();
			for (int i = 0; i < s1.length; i++) {
				set.add(s1[i]);

			}
	//Compare each character of set with all word of given string
			for (String ch : set) {
				int count = 0;
				for (int i = 0; i < s1.length; i++) {
					if (ch .equals(s1[i])) {
						count++;
					}
				}
				if(count>1) {
					
				System.out.println(ch + " " + count);
			}

		}
	
	}

}
