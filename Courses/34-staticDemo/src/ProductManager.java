public class ProductManager { //Veritabanına kaydeder veya bilgi alır
    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("Eklendi");
        } else {
            System.out.println("Ürün Bilgileri Geçersizdir");
        }
    }
}
