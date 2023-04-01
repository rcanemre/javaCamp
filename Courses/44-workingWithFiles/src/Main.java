import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Java2023\\files\\students.txt");
        try {
            if (file.createNewFile()) {  //Dosyayı oluştrur ve true yada false döndürür.
                System.out.println("Dosya Oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException exception) {
            exception.printStackTrace();    //Kırmızı hata kodunu yazdırır.
        }
    }
}
