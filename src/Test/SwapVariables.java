package Test;

import java.util.Scanner;

public class SwapVariables {

	public void Swap (int var1, int var2) {
		int var = var1;
		var1 = var2;
		var2= var;
		System.out.println("The variables after swapping are : " + var1 + "," + var2);
	}
	
	public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first variable : ");
		int v1 = scanner.nextInt();
		System.out.println("Enter second variable : ");
		int v2 = scanner.nextInt();
		
		System.out.println("The variables before swapping are: " + v1 + "," + v2);
		
		SwapVariables variables = new SwapVariables();
		variables.Swap(v1,v2);
		
	}

}
