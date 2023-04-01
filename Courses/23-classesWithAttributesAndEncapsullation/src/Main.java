public class Main {

    public static void main(String[] args) {

        //Bir class sadece bir işi yapar - Single Responsibility
        //Yazılım Geliştirme Kuralları - SOLID

        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());

    }
}
