public class Main {

    public static void main(String[] args) {
        //Try-Catch ile çalışma anındaki hataları yönetiriz. Yani kod build edilir
        //ortaya çalışan bir kod çıkar fakat doğru sonuç vermez.

        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[5]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (Exception exception) {     //Diğer hatalar değilse hangisi öğrendik
            System.out.println("Loglandı : "+exception);
        } finally {
            System.out.println("Her zaman çalışır");
            //Veritabanındaki bağlantıyı kapatmak için kullabiliriz
            //Aynı şey dosyalar içinde geçerlidir.
        }

    }
}
//Uygulama try bloğunda hata alırsa catch bloğuna gider. Ama uygulama çalışmayı
//durdurmaz. Hatanın türü catch içinde parametre olarak verilir.

//StringIndexOutOfBoundsException yazarken uygulama kırılır, çünkü try ve catch
//birlikte çalışmadı. 2 tane catch yazarsak uygulama durmaz, catch'lerden biri çalıştı.
