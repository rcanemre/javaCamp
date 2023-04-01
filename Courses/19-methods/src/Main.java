public class Main {

    public static void main(String[] args) {
        sayiBulmaca();



    }

    public static void sayiBulmaca(){
        int[] number = new int[] {1,2,5,7,9,0};
        int search = 99;
        boolean control=false;

        for(int x:number){
            if(x==search){
                mesajVer("Aranan Sayı : "+search+" Bu Dizinin İçindedir");
                control = true;
                break;
            }
        }
        if(control == false){
            mesajVer("Aranan Sayı : "+search+" Bu Dizinin İçinde Değildir");
            System.out.println("Aranan Sayı : "+search+" Bu Dizinin İçinde Değildir");
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}