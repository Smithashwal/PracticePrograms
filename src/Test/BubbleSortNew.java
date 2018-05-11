package Test;

public class BubbleSortNew {

	public int[] bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		return a;
	}

	public void printSortedArray(int[] sorted) {
		System.out.println("The sorted array is : ");
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]);
			if (i < sorted.length - 1) {
				System.out.print(",");
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 9, 5, 4, -1, 0, 20 };
		BubbleSortNew bubbleSort = new BubbleSortNew();
		int[] sorted = bubbleSort.bubbleSort(a);
		bubbleSort.printSortedArray(sorted);

	}

}
