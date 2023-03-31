package miniProjects;

import java.util.Scanner;

public class miniProject1 {

	public static void main(String[] args) {
		// Prime Numbers

		// Get input from user
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int number = myObj.nextInt();
		boolean isPrime = true;

		if (number < 0) {
			System.out.println("You entered a negative number. Please try again!");
		} else if (number == 1) {
			System.out.println("Not a prime number!");
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Prime number!");
			} else {
				System.out.println("Not a prime number!");
			}
		}
	}

}
