package ArrayProgramme;

public class SummationOfGivenNumber {
	public static void main(String[] args) {
		int num=456;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev+rem;
			num=num/10;
		}
		System.out.println("summation of given no is "+rev);
	}

}
