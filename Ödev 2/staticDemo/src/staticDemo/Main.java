package staticDemo;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Mouse";
		product.price = 20;
		
		ProductManager manager = new ProductManager();
		manager.add(product);
		
		DatabaseHelper.Crud.update();
		DatabaseHelper.Connection.createConnection();
	}

}
