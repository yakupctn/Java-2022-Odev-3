package interfaces;

public class CustomerManager {
	ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// Buraya iş kodları yazılır.
		customerDal.add();
	}

}
