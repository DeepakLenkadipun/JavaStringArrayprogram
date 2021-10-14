package PracticeProgramme;

public class ArmStrongNumber {
public static void main(String[] args) {
	int num=417;
	int temp=num;
	int count=0;
	while(temp!=0) {
		int rem=temp%10;
        temp=temp/10;
		count++;
	}
	System.out.println(count);
    temp=num;
	int sum=0;
	while(temp!=0) {
		int rem=temp%10;
		int res=1;
		for(int i=count;i>=1;i--) {
			res=res*rem;
		}
		sum=sum+res;
		temp=temp/10;
	}
	if(num==sum) {
		System.out.println("no is armstrong");
	}else {
		System.out.println("is not a armstrong");
	}
 }
}
