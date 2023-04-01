public class Main {
    public static void main(String[] args) {
        char harf = 'a';
        boolean hata = false;
        char[] harfler = {'a', 'ı', 'o', 'u', 'A', 'I', 'O', 'U',
                'e', 'i', 'ö', 'ü', 'E', 'İ', 'Ö', 'Ü'};

        for (int i = 0; i < 16; i++) {
            if (harf == harfler[i]) {
                if (i <= 7) {
                    System.out.println("Kalın Sesli Harftir : " + harf);
                    hata = true;
                    return;
                } else {
                    System.out.println("İnce Sesli Harftir : " + harf);
                    hata = true;
                    return;
                }
            }
        }
        if(hata ==false){
            System.out.println("Sesli Harf Girmediniz");
        }
    }
}