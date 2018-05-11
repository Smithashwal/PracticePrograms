package Test;

public class ReverseArray {

	public void reverseArray(int[] a) {
		int i = 0, j = a.length - 1;

		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}

		for (i = 0; i < a.length; i++) {
			int c = a[i];
			System.out.print(c);
			if (i < a.length - 1) {
				System.out.print(",");
			}

		}

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		ReverseArray reverseArray = new ReverseArray();
		reverseArray.reverseArray(a);

	}

}
