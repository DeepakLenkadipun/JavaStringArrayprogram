package ArrayProgramme;

public class DesecendingOrderOfArray {
	public static void main(String[] args) {
		int[] a = { 10, 50, 40, 30, 20 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
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
		System.out.println("1st maximum number --> "+a[0]);  //1st maximum number
		System.out.println("1st minimum number --> "+a[a.length-1]);//1st minimum number
		System.out.println("2nd maximum number -->"+a[1]);
	}
}
