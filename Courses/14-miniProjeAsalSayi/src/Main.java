public class Main {

    public static void main(String[] args) {

        int number = 5;
        int remainder = 0;
        if (number < 1) {
            System.out.println("Geçersiz Sayı");
            return;
        }
        if (number == 2) {
            System.out.println(number + ": Sayısı Asal Sayıdır");
            return;
        }
        for (int i = 2; i < number; i++) {
            remainder = number % i;
            if (remainder == 0) {
                break;
            }
        }
        if (remainder == 0) {
            System.out.println(number + ": Sayısı Asal Değildir");
        } else {
            System.out.println(number + ": Sayısı Asaldır");
        }
    }
}
