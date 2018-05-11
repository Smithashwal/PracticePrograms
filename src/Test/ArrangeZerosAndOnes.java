package Test;

public class ArrangeZerosAndOnes {

	public int[] getSorted(int[] a) {

		int i = 0, j = a.length - 1;

		while (i < j) {
			if (a[i] == 0)
				i++;

			if (a[i] == 1 && a[j] == 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}

			else if (a[i] == 1 && a[j] == 1)
				j--;
		}
 return a;
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 0, 1, 0, 0, 1, 1, 0 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println();
		ArrangeZerosAndOnes arranged = new ArrangeZerosAndOnes();
		int[] newArray = arranged.getSorted(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(newArray[i]);
			if (i != a.length - 1) {
				System.out.print(",");
			}
		}

	}
}
