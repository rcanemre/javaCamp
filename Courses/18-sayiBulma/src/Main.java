public class Main {

    public static void main(String[] args) {

        int[] number = new int[] {1,2,5,7,9,0};
        int search = 9;
        boolean control=false;

        for(int x:number){
            if(x==search){
                System.out.println("Aranan Sayı : "+search+" Bu Dizinin İçindedir");
                control = true;
            break;
            }
        }
        if(control == false){
            System.out.println("Aranan Sayı : "+search+" Bu Dizinin İçinde Değildir");
        }
    }
}
