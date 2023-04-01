public class Main {

    public static void main(String[] args) {

        int sayi1=24;
        int sayi2=25;
        int sayi3=26;
        int biggest = sayi1;

        if(biggest<sayi2){
            biggest=sayi2;
        }

        if(biggest<sayi3){
            biggest=sayi3;
        }

        System.out.println("En Büyük Sayı : "+biggest);

    }
}
