import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int total = 0;
        BufferedReader reader = null;
        try {
            String line = null;
            reader = new BufferedReader(new FileReader("C:\\Java2023\\41-readingFileDemo\\src\\sayilar.txt"));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                total += Integer.valueOf(line);
            }
            System.out.println("Toplam : " + total);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}