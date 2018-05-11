package Test;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
     
	 	int m=10;
	 Scanner scanner = new Scanner(System.in);
	 
	System.out.println("Enter the number : ");
	int num =scanner.nextInt();
	
     System.out.println("The multiplication table of "+ num + " is :");
     for(int i=1; i<=m; i++) {
    	 
    	 System.out.println(num + " x " + i + " = "  + (num*i));
     }
	}

}
