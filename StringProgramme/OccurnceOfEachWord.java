package StringProgramme;

import java.util.HashSet;

public class OccurnceOfEachWord {
	public static void main(String[] args) {
		String s = "man is common man";
		String[] str = s.split(" ");
//1.create set collection(hashset) and add all the word of given String into set		
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);

		}
//2.Compare each word of set with all word of given string
		for (String sh : set) {
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				if (sh.equals(str[i])) {
					count++;
				}
			}

			System.out.println(sh + " " + count);
		}

	}

}
