package StringProgramme;

import java.util.LinkedHashSet;

public class RemoveDuplicatewords {
	public static void main(String[] args) {
		String s="my name is deepak lenka my name";
		String [] s1=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<s1.length;i++) {
		      set.add(s1[i]);
		}
		for(String sh:set) {
	
			System.out.print(sh + " ");
		}
	}
}
