package Test;

public class GreatestInArray {

	public void getGreatest (int[] a) {
		
		int greatest=0, greater=0;
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i]>greatest) {
				greater=greatest;
				greatest= a[i];
			}
			
			else if(a[i]>greater) {
				greater=a[i];
			}
		}
		System.out.println("The greatest number in the array is: " + greatest);
		System.out.println("Greater number in the array is: "+ greater);
	}
	
	public static void main(String[] args) {

		int[] a= {6,9,50,1,49,80,100,99};
		GreatestInArray greatest1 = new GreatestInArray();
		//int max= 
				greatest1.getGreatest(a);
		//System.out.println("The greatest number in the array is : " + max);
	}

}
