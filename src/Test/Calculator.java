package Test;

import java.util.Scanner;

public class Calculator {

	public void calculate(int num1, int num2, int choice) {
		int res;

		switch (choice) {
		case '1':
			res = num1 + num2;
			System.out.println("Addition of two numbers is : " + res);
			break;

		case '2':
			res = num1 - num2;
			System.out.println("Subtraction of two numbers is : " + res);
			break;

		case '3':
			res = num1 * num2;
			System.out.println("Multiplication of two numbers is : " + res);
			break;

		case '4':
			res = num1 / num2;
			System.out.println("Division of two numbers is : " + res);
			break;

		case '5':
			System.exit(0);
			break;

		default:
			System.out.println("wrong input!!!");
			break;
		}
		System.out.println("----------------------------------------------");
	}

	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);

		while (choice != 5) {

			System.out.println("1. Addition(+) ");
			System.out.println("2. Subtraction(-) ");
			System.out.println("3. Multiplication(*) ");
			System.out.println("4. Division(/) ");
			System.out.println("5. Exit ");
			System.out.println("Enter your choice : ");
			choice = scanner.next().charAt(0);

			System.out.println("Enter the first number: ");
			int num1 = scanner.nextInt();
			System.out.println("Enter the second number: ");
			int num2 = scanner.nextInt();

			Calculator calculate = new Calculator();
			calculate.calculate(num1, num2, choice);
		}
	}

}
