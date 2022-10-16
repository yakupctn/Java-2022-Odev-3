package polymorphismDemo;

public class ConsoleLogger extends BaseLogger {
	@Override
	public void log(String message) {
		System.out.println("Logged to console : " + message);
	}

	// Override => Bir sınıf miras almış olduğu sınıfın bir metodunu kopya yapıp
	// yapıp kullanabilir ve kendine göre özelleştirebilir buna Override denir.
}
