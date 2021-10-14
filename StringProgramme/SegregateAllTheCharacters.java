package StringProgramme;

public class SegregateAllTheCharacters {
	public static void main(String[] args) {
	   String s3="DEEPAK KUMAR LENKA";
	   String s=s3.toLowerCase();
	   String [] str=s.split(" ");
	  // System.out.println(str.length);
	   for(String s1:str) {
	   System.out.print(s1.replace(s1.substring(0,1),s1.substring(0, 1).toUpperCase())+" "); 
			  
	 //  System.out.println((s1.replace(s1.substring(s1.length()-1),s1.substring(s1.length()-1).toUpperCase() )));
			   
		 
	   }
//       String s1= s.substring(0, 1);
//       String first=s1.toUpperCase();
//       String second= s.substring(1);
//       System.out.println( first+second);
//       
	  }
		
		
		
//		String s = "abc476@#89uk*&";
//		
//		String Alpha = "";
//		String Numeric = "";
//		String Splchr = "";
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
//				Alpha = Alpha + s.charAt(i);
//			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
//				Numeric = Numeric + s.charAt(i);
//			} else {
//				Splchr = Splchr + s.charAt(i);
//			}
//		}
//		System.out.println(Alpha);
//		System.out.println(Numeric);
//		System.out.println(Splchr);
	
}
