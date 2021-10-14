package PracticeProgramme;

import java.util.LinkedHashSet;

public class SeparateVowel {
public static void main(String[] args) {
	String s="deepak kumar lenka";
	String s1="aeiou";
	LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
	for(int i=0;i<s1.length();i++) {
		lhs.add(s1.charAt(i));
	}
	for(Character ch:lhs) {
		int count=0;
		for(int i=0;i<s.length();i++){
			
			if(ch==s.charAt(i)) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(ch+" "+count);
		}
	}
 }
}
