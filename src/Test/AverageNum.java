package Test;

import java.util.Scanner;

public class AverageNum {

	public int input(int n1, int n2, int n3) {
		int average= ((n1+n2+n3)/2);
		return average;		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter three numbers :");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter third number: ");
		int num3= scanner.nextInt();
		
		AverageNum avgNum = new AverageNum();
		int m = avgNum.input(num1, num2, num3);
		
		System.out.println("The average of numbers is: " + m);
		
	}

}
