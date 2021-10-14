package ArrayProgramme;

public class AsseccendingOrderofArray {
	public static void main(String[] args) {
		int[] a = { 10, 50, 40, 30, 20 ,10,20};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		
		System.out.println();
		System.out.println("1st minimum number --> "+a[0]);//1st minimum number
		System.out.println("2nd minimum number-->"+a[1]); //2nd minium number
	}

}
