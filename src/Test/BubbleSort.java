package Test;

public class BubbleSort {

	public int[] sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}

		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 5, 1, 4, 2, 0, -1, 8 };
		BubbleSort bubblesort = new BubbleSort();
		int[] sorted = bubblesort.sort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(sorted[i]);
			if (i != a.length - 1) {
				System.out.print(",");
			}
		}

	}
}
