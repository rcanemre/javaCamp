package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setImageUrl("image1.jpg");
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setDiscount(7);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setImageUrl("image2.jpg");
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(10);
		product2.setDiscount(5);

		Product product3 = new Product();
		product3.setName("Khitchen Aid Kahve Makinesi");
		product3.setImageUrl("image3.jpg");
		product3.setUnitPrice(5800);
		product3.setUnitsInStock(5);
		product3.setDiscount(8);
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12324341");
		individualCustomer.setPhone("23728372873");
		individualCustomer.setFirstName("Emre");
		individualCustomer.setLastName("ERCAN");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("ercan soft");
		corporateCustomer.setCustomerNumber("83838373652");
		corporateCustomer.setPhone("76276376");
		corporateCustomer.setTaxNumber("83621");

	}

}
