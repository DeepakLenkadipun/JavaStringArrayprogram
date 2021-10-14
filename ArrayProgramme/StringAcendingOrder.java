package ArrayProgramme;

public class StringAcendingOrder 
{
	public static void main(String[] args) {
		String[] a = { "hi", "bye", "p", "mango", "tyss", };
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i].charAt(0) > a[j].charAt(0)) 
				{
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;

		 		}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		System.out.println("maximu element containt string is --> "+a[a.length-1]);
	}
}
