package StringProgramme;

public class SeparateEvenNoandAdd {
	public static void main(String[] args) {
		int i=3456789;
	    String s=Integer.toString(i);
	    String replacedno=s.replace(s.substring(4, 5),"");
	    System.out.println(replacedno);
	    int i1=Integer.parseInt(replacedno);
	    System.out.println(i1);
	}
}
	
//		int num1=3456789;
//		int temp=0;
//		while(num1!=0) {
//			
//			int rem=num1%10;
//			
//			if(rem!=7) {
//			 temp=temp*10+rem;
//			}
//			num1=num1/10;
//		}
//		System.out.println(temp);
//		
//	}
//}
//int num=9342558;
//		int sum=0;
//		while(num!=0) {
//			int rem=num%10;
//			if(rem%2==0) {
//				sum=sum+rem;	
//			}
//			num=num/10;
//		}
//		
//		System.out.println(sum);
//		
//	}

//}
