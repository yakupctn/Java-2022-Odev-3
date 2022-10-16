package staticDemo;

public class ProductValidator {
	public static boolean isValid(Product product) {          // => Bir metod static yapıldığında nesnesini oluşturmaya gerek kalmadan direk class ismiyle çağırabiliriz.
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
