public class Main {

    public static void main(String[] args) {
    //operation,methods,function

        String message = "Bugün hava çok güzel.";
        String newMessage = message.substring(0,5);
        System.out.println(newMessage);

        int total = topla(3,4);
        System.out.println(total);

        System.out.println(sehirVer());

        //variable argumenst
        int total2 = topla2(2,3,4,5,6,7);
        System.out.println(total2);
    }

    public static void add(){
        System.out.println("Eklendi");
    }

    public static void delete(){
        System.out.println("Silindi");
    }

    public static void update(){
        System.out.println("Güncellendi");
    }

    public static int topla(int a,int b){
        return a+b;
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam +=sayi;
        }
        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }


}
