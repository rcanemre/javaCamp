public class Main {

    public static void main(String[] args) {

        double[] myList = {1.2, 1.3, 40.3, 5.6};

        //Ekrana Yazdır
        for (double number : myList) {
            System.out.println(number);
        }
        System.out.println("-----------------------------");

        //Sayıların Toplamı
        double total = 0;
        for (double number : myList) {
            total += number;
        }
        System.out.println("Sayıların Toplamı : " + total);
        System.out.println("-----------------------------");

        //En Büyük Sayısı Bulma
        double biggest = 0;
        for (double number : myList) {
            if (biggest < number) {
                biggest = number;
            }
        }
        System.out.println("En Büyük Sayı : " + biggest);

    }
}
