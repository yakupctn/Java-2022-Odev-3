
public class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer) {
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save(Customer customer2) {
		System.out.println("Müşteri kaydedildi: ");
	}

	public void delete(Customer customer2) {
		System.out.println("Müşteri silindi: ");
	}

	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi...");
	}
}
