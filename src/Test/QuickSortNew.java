package Test;

public class QuickSortNew {

	public int[] quickSort(int[] a, int start, int pivot) {
		int i = start - 1, j = start;
		if (start > pivot) {
			return a;
		}
		while (j < pivot) {
			if (a[pivot] > a[j]) {
				i++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				j++;
			} else {
				j++;
			}
		}

		int temp = a[pivot];
		a[pivot] = a[i + 1];
		a[i + 1] = temp;

		quickSort(a, start, pivot - 1);
		quickSort(a, pivot + 1, a.length - 1);

		return a;
	}

	public void printSortedArray(int[] sorted) {
		System.out.println("The sorted array is: ");
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]);
			if (i < sorted.length - 1) {
				System.out.print(",");
			}
		}
	}

	public static void main(String[] args) {

		int[] a = { 9, 5, 4, -1, 8, 2, 6 };
		QuickSortNew quickSort = new QuickSortNew();
		int[] sorted = quickSort.quickSort(a, 0, a.length - 1);
		quickSort.printSortedArray(sorted);

	}

}
