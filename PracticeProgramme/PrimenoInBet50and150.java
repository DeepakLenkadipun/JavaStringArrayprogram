package PracticeProgramme;

import java.util.Scanner;

public class PrimenoInBet50and150 {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	//for(num=50;num<=150;num++) {
		int count=0;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			count++;
		}
	}

	if(count==0) {
		System.out.println(num+"num is prime");
	}else {
		System.out.println(num+"not prime");
	}
//}
}
}
