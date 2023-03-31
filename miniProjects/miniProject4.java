package miniProjects;

import java.util.Scanner;

public class miniProject4 {

	public static void main(String[] args) {
		// Amicable Numbers (Arkadaş Sayılar)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		int total_1 = 0;
		int total_2 = 0;
		
		for (int i = 1; i < num1; i++) {
			if(num1 % i == 0) {
				total_1 += i;
			}
		}
		for (int i = 1; i < num2; i++) {
			if(num2 % i == 0) {
				total_2 += i;
			}
		}
		
		if (total_1 == num2 && total_2 == num1) {
			System.out.println("Amicable numbers!");
		}else {
			System.out.println("Not amicable numbers!");
		}
	}

}
