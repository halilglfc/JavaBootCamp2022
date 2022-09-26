package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setPrice(12500);
		product.setDescription("Lenovo");
		product.setStockAmount(5);
		
		
	
		
		product.getId();
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
	}

}
