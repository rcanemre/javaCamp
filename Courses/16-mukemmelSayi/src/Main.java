public class Main {

    public static void main(String[] args) {
        int number = 28;
        int total = 0;

        if (number <= 1) {
            System.out.println("Girilen Sayı Geçersizdir");
            return;
        }

        for (int i = 1; i < number; i++) {
            if ((number % i) == 0) {
                total += i;
            }
        }

        if (number == total) {
            System.out.println(number + ": Mükemmel Sayıdır");
        } else {
            System.out.println(number + ": Mükemmel Sayı Değildir");
        }
    }
}
