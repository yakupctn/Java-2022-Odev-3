package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;       // => BaseLogger tipinde bir değişken tanımladık.

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Müşteri eklendi.");
		logger.log("Log mesajı");
	}
	
	
	

}
