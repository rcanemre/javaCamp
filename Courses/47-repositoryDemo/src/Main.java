public class Main {

    public static void main(String[] args) {
        //Repository deseni veritabanı işlemleri için kullanılır.

        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);

    }
}
