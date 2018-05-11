package Test;

public class MergeSort {

	public void divide(int[] a, int low, int high) {

		if(high<=low) return;
		
		int mid = (low + high) / 2;

		divide(a, low, mid);
		divide(a, mid + 1, high);

		merge(a, low, mid, high);
		
	}

	public void merge(int[] a, int low, int mid, int high) {

		int[] l = new int[(mid - low) + 1];
		int[] r = new int[high - mid];

		int k = 0;
		for (int i = low; i <= mid; i++) {
			l[k++] = a[i];
		}

		k = 0;
		for (int i = mid + 1; i <= high; i++) {
			r[k++] = a[i];
		}

		int[] result = new int[(high - low) + 1];
		int i = 0, j = 0;
		k=0;

		while (i <l.length && j <r.length) {
			if (l[i] < r[j]) {
				result[k++] = l[i++];
			} else {
				result[k++] = r[j++];
			}
		}

		while (i < l.length) {
			result[k++] = l[i++];
		}

		while (j < r.length) {
			result[k++] = r[j++];
		}
		
		k=0;
		for(i=low;i<=high;i++) {
			a[i]=result[k++];
		}

	}
	
	public void printArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
	}

	public static void main(String[] args) {

		MergeSort sort= new MergeSort();
		int[] a= {5,4,3,2,1};
		System.out.println("The given array is :");
		sort.printArray(a);
		
		System.out.println("\n--------------------------------------------");
		sort.divide(a, 0, a.length-1);
		sort.printArray(a);
		
		
	}

}
