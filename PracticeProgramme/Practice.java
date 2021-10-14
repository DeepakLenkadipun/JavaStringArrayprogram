package PracticeProgramme;

import java.util.LinkedHashSet;

public class Practice {
	public static void main(String[] args) {
	
	int temp=121;
	int num=temp;
	int rev=0;
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(temp==rev) {
		System.out.println("pallindrum");
	}else {
		System.out.println("not a pallindrum");
	}
    }
   
 
}