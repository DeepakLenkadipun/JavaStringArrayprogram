package StringProgramme;

public class ReverseAStatement {
	public static void main(String[] args) {
		String s="khatam tata bye bye";
	String [] str=s.split(" ");
	String rev="";
	for(int i=str.length-1;i>=0;i--) {
	//	System.out.println(str[i]);
		rev=rev+str[i]+" ";
	}
	System.out.println(rev+" ");
	}

}
