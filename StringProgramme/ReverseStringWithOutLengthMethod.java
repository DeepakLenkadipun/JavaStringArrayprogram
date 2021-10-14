package StringProgramme;

public class ReverseStringWithOutLengthMethod {
	
	public static void main(String[] args) {
		
		String s="india";
		char []ch=s.toCharArray();
		int count=ch.length;
//		int count=0;
//		for(char c1:ch) {
//			count++;
//			
//		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(ch[i]);

		}
	}

}
