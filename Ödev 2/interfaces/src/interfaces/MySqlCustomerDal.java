package interfaces;

public class MySqlCustomerDal implements ICustomerDal {   // implements => MySqlCustomerDal sınıfı, ICustomerDal interface'ini miras aldı.

	@Override
	public void add() {
		System.out.println("My Sql eklendi.");
	}

}
