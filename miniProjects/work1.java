package intro;

import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {
		
		//Girdiğimiz 3 adet sayıdan hangisinin büyük olduğunu bulan program
		
		Scanner input = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Lütfen karşılaştırmak istediğiniz 1.sayıyı girin : ");
		a = input.nextInt();
		
		System.out.println("Lütfen karşılaştırmak istediğiniz 2.sayıyı girin : ");
		b = input.nextInt();
		
		System.out.println("Lütfen karşılaştırmak istediğiniz 3.sayıyı girin : ");
		c = input.nextInt();
		
		int bigNumber = a;
		
		if (bigNumber < b) {
			
			bigNumber = b;
			
		}
		
		if (bigNumber < c) {
			
			bigNumber = c;
			
		}
		
		System.out.println("En Büyük Sayı : " + bigNumber);
		

	}

}
