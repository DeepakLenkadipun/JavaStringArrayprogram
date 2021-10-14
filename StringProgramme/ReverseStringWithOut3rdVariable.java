package StringProgramme;

public class ReverseStringWithOut3rdVariable {
	
	public static void main(String[] args) 
	{
		 String s="india";
		 System.out.println("given string is "+s);
		 for(int i=s.length()-1;i>=0;i--) {
			 System.out.print(s.charAt(i)+" ");
		 }
	}

}
