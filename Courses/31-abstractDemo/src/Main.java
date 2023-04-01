public class Main {

    public static void main(String[] args) {
    //Solid Open-Closed Principle
    CustomerManager customerManager = new CustomerManager();
    customerManager.baseDatabaseManager = new MySqlDatabaseManager();
    customerManager.getCustomers();

    }
}
