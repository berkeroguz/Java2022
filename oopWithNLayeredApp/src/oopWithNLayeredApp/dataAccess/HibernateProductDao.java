package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	@Override
	public void add(Product product) {
		//Hibernate kodları
		System.out.println("Hibernate ile veritabanına eklendi.");
	}	

}
