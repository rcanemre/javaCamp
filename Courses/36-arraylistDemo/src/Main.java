import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        int[] sayilar = new int[]{1,2,3};
//        sayilar = new int[4];
//        System.out.println(sayilar[0]);
//        Dizi olduğu için new yaptığımızda yeni bir referans vermiş olduk.

        ArrayList sayilar = new ArrayList();
        System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
//        System.out.println(sayilar.size());
//
//        System.out.println(sayilar.get(0));
//
//        sayilar.set(2,100);
//        System.out.println(sayilar.get(2));
//
//        sayilar.remove(0);
//        System.out.println(sayilar.get(0));
//        Remove kullandığımızda 0.index silinir ama diğer elemanlar 1 sola kayar.
//
//        sayilar.clear(); //Tüm elemanları siler
//        System.out.println(sayilar.get(0)); //Hata verir

        for(Object i:sayilar){
            System.out.println(i);
        }
        
        

    }
}