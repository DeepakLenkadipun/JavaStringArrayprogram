package ArrayProgramme;

import java.util.Scanner;

public class PallindrumNumber {
	public static void main(String[] args) {
		
//	String s="peeep";
//	String temp="";
//	for(int i=s.length()-1;i>=0;i--) {
//		temp=temp+s.charAt(i);
//	 }
//	if(s.equals(temp)) {
//		System.out.println(s+"  it is a pallindrum String");
//	}else {
//		System.out.println(s+"  not a pallindrum String");
//	}
//  }
//}
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem; 
			temp=temp/10;
		}
		if(num==rev) {
			System.out.println("it is a pallindrom");
		}
		else
		{
			System.out.println("it is not a pallindrom");
		}
	}

}
