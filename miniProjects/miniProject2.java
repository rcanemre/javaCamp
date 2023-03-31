package miniProjects;

import java.util.Scanner;

public class miniProject2 {

	public static void main(String[] args) {
		// High and low vowels
		// According to Turkish

		Scanner sc = new Scanner(System.in);
		System.out.println("Works with Turkish vowels!");
		System.out.print("Enter a vowel: ");

		char myChar = sc.next().charAt(0);
		boolean isHigh = false;

		char[] highVowels = { 'a', 'ı', 'o', 'u', 'A', 'I', 'O', 'U' };

		for (char c : highVowels) {
			if (myChar == c) {
				isHigh = true;
				break;
			}
		}
		if (isHigh) {
			System.out.println("High vowel!");
		} else {
			System.out.println("Low vowel!");
		}
	}

}
