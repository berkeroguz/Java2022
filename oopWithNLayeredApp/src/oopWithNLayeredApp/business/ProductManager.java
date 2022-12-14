package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers; //Logger dizisi oluşturduk. //Polymorphsim
	
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		super();
		this.productDao = productDao;
		this.loggers=loggers;
		//BUSINESS KISMINI DATABASE ILE ILISKINSINI KESTIK SADECE INTERFACE'E GEVSEK BAGLI
	}
	
	public void add(Product product) throws Exception { 
		
		
		
		//iş kuralları
		if(product.getUnitPrice()<10)
		{
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) {//[db,mail]
			logger.log(product.getName());
			
		}
		
		
		
	}

}
