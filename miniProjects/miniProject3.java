package miniProjects;

import java.util.Scanner;

public class miniProject3 {

	public static void main(String[] args) {
		// Perfect numbers

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int number = myObj.nextInt();
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		if (total == number) {
			System.out.println("Perfect number!");
		} else {
			System.out.println("Not a perfect number!");
		}
	}

}
