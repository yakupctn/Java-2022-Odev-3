package interfaces;

public class Main {

	public static void main(String[] args) {
		/*
		 * ICustomerDal customerDal = new OracleCustomerDal();        // => OracleCustomerDal sınıfı, ICustomerDal'i implements
		 *                                                           ettiği için onun referans tipini tutar.Buyüzden tip uyumsuzluğu olmaz. 
		 * customerDal.add();
		 */
		
		CustomerManager customerManager  = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
	}

}
