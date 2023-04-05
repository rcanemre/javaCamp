package oopWithNlayeredApp.business;

import java.util.List;

import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.dataAccess.HibernateProductDao;
import oopWithNlayeredApp.dataAccess.JdbcProductDao;
import oopWithNlayeredApp.dataAccess.ProductDao;
import oopWithNlayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		
		if(product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10dan küçük olamaz");
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
			
		}
	}

}
