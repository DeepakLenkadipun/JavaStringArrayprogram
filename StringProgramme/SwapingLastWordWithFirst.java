package StringProgramme;

public class SwapingLastWordWithFirst {
	public static void main(String[] args) {
		
//	
//	String s="welcome to tyss";
//	String [] str=s.split(" ");
//	
//	String temp=str[0];
//	    
//	str[0]=str[str.length-1];
//	
//	str[str.length-1]=temp;
//	for(String s1:str) {
//		System.out.println(s1);
//	}
//	}
		String d="deepak";
		char []ch=d.toCharArray();
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		System.out.println(ch);
	}		
}
