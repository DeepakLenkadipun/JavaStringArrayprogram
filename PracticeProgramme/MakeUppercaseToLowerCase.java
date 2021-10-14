package PracticeProgramme;

public class MakeUppercaseToLowerCase {
	public static void main(String[] args) {
		String s="My Name Is DeePAK";
	  for(int i=0;i<s.length();i++) {
		  
		  if(s.charAt(i)>=65&&s.charAt(i)<=90) {
			 String temp= s.charAt(i)+"";
			 System.out.print(temp.toLowerCase());
		  }else {
			  String temp= s.charAt(i)+"";
			  System.out.print(temp.toUpperCase());
		  }
	  }
	}

}
