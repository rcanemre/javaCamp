public class Main {

    public static void main(String[] args) {

        int number1 = 1184;
        int number2 = 1210;
        int totalA = 0;
        int totalB = 0;

        for (int i = 1; i < number1; i++) {
            if ((number1 % i) == 0) {
                totalA += i;
            }
        }

        for (int j = 1; j < number2; j++) {
            if ((number2 % j) == 0) {
                totalB += j;
            }
        }
        if ((totalA == number2) & (totalB == number1)) {
            System.out.println(number1 + " " + number2 + " Sayıları Arkadaş Sayılardır");
        } else {
            System.out.println(number1 + " " + number2 + " Sayıları Arkadaş Sayılar Değildir");
        }
    }
}
