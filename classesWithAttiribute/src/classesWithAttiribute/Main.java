package classesWithAttiribute;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Notebook");
		product.setPrice(1000);
		product.setStockAmount(2);
		
		System.out.println(product.getKod());
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		

	}

}
