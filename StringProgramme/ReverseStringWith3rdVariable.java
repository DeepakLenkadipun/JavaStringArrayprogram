package StringProgramme;

public class ReverseStringWith3rdVariable {
	public static void main(String[] args) 
	{
		 String s="india";
		 String rev="";
		 System.out.println("given string is "+s);
		 for(int i=s.length()-1;i>=0;i--) {
			 rev=rev+s.charAt(i)+" ";
		 }
		 System.out.println("original String "+s);
		 System.out.println("reverse string "+rev);
	}

}
