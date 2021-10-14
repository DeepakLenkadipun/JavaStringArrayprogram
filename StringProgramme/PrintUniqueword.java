package StringProgramme;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueword {
	public static void main(String[] args) {
		String s="my name is deepak lenka my name";
		String [] s1=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<s1.length;i++) {
		      set.add(s1[i]);
		}
		for(String sh:set) {
			int count=0;
			for(int i=0;i<s1.length;i++) {
				
				if(sh.equals(s1[i])) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(sh + " ");
			}
		
		}
	}

}
