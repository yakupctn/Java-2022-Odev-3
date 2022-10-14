
public class Main {

	public static void main(String[] args) {

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();
		customer.setId(1);

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save(customer);
		customerManager.delete(customer);

		Company company = new Company();
		company.setTaxNumber("546521");
		company.setCompanyName("MY COMPANY");

		CustomerManager customerManager2 = new CustomerManager(new Customer());

		Person person = new Person();

	}

}
