package Test;

public class QuickSort {

	public int[] quickSort(int[] a, int start, int pivot) {
		int i=start-1, j=start;
		
		if(start>pivot) {
			return a;
		}
		
		while(j<pivot) {
			if(a[pivot]> a[j]) {
				i++;
				int temp= a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
			}
			else
				j++;
		}
		
		int temp= a[pivot];
		a[pivot]=a[i+1];
		a[i+1]=temp;
		
		quickSort(a,start,pivot-1);
		quickSort(a,pivot+1,a.length-1);
		
		return a;
	}
	
	
	public static void main(String[] args) {
       int[] a= {9,5,4,8,2,3,7,1,6};
       QuickSort quickSort = new QuickSort();
       quickSort.quickSort(a,0, a.length-1);
       
       
       System.out.println("The sorted array is: ");
       for(int i=0;i<a.length;i++) {
    	   System.out.print( a[i]);
    	   if(i<a.length-1) {
    		   System.out.print(",");
    	   }
       }
	}

}
