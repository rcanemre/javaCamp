//built-in Java'nın içinde olan paketler
// Başka paketlerin kullanılışı

import matematik.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız:");

        String isim = scanner.nextLine();

        System.out.println("Merhaba " + isim);

        Dortislem dortislem = new Dortislem();
        int result = dortislem.topla(3, 4);
        System.out.println(result);

        Logaritma logaritma = new Logaritma();

    }
}
