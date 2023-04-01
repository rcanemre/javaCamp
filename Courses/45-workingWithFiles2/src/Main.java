import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();

    }

    public static void createFile(){
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

    public static void getFileInfo(){
        File file = new File("C:\\Java2023\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya Adı : "+file.getName());
            System.out.println("Dosya Yolu : "+file.getAbsolutePath());
            System.out.println("Dosya Yazılabilir mi? : "+file.canWrite());
            System.out.println("Dosya Okunabilir mi? : "+file.canRead());
            System.out.println("Dosya Boyutu? : "+file.length()); //byte cinsinden verir


        }else{
            System.out.println("Dosya mevcut değil");
        }
    }

    public static void readFile(){
        File file = new File("C:\\Java2023\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Java2023\\files\\students.txt"));
//            writer.write("Ahmet");
//            System.out.println("Dosyaya Yazıldı");
//            writer.close();
//Bu şekilde yazılırsa dosyanın üzerine yazar, eski bilgiler kaybolur.

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Java2023\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");              //true dosyaya ekleme modunda yazar
            System.out.println("Dosyaya Yazıldı");
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
