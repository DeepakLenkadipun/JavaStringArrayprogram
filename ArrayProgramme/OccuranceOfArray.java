package ArrayProgramme;

import java.util.HashSet;

public class OccuranceOfArray {
public static void main(String[] args) {
	int [] x= {10,20,30,40,10,20,40,60,70};
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<x.length;i++) {
		hs.add(x[i]);
	}
	for(Integer in:hs) 
	{    int count=0;
		for(int i=0;i<x.length;i++)
		{
			if(in==x[i]) {
				count++;
			}
		}
		System.out.println(in+" "+count);
	}
	
}
}
