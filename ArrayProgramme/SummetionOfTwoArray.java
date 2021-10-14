package ArrayProgramme;

public class SummetionOfTwoArray {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9 };
		int[] b = { 2, 4, 6, 8, };

		int count = a.length;
		if (a.length < b.length) {
			count = b.length;
		}

		for (int i = 0; i < count; i++) {
			try {
				System.out.print(a[i] + b[i]+" ");
			} catch (Exception e) {
				if (a.length > b.length) {
					System.out.print(a[i]+" ");
				} else {
					System.out.print(b[i]+" ");
				}
			}
		}
	}
}
