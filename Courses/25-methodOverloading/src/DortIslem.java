public class DortIslem {
    public int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public int topla(int...sayilar){
        int total=0;
        for(int sayi:sayilar){
            total +=sayi;
        }
        return total;
    }
}
