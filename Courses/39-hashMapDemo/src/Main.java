import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //Hashmap generic tiptedir.
        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");
        System.out.println(sozluk.size());

        for (String item : sozluk.keySet()) {
            System.out.println(item + " = " + sozluk.get(item));
        }
        //keySet ifadesi sırayla gelmez, java kendi algoritmasına göre getirir.

        sozluk.remove("table");
        sozluk.clear();
        //sonuç null olur, tuttuğu referans yoktur.
        System.out.println(sozluk.get("table"));
    }
}
