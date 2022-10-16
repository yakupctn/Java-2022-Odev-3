package abstractClasses;

public abstract class GameCalculator {
	public abstract void puanHesapla();    // abstract metodlar miras alınırsa Override edilmek zorundadır.
	
	public final void gameOver() {            // final olduğu için bu metodu miras alanlar asla değiştiremez ancak olduğu gibi kullanabilirler.
		System.out.println("Oyun bitti");
	}
	
	// Not => abstract classlar new'lenemez yani aşağıdaki kullanımı yapamayız.
	// GameCalculator calculator = new GameCalculator();
	
	// Ama alttakini kullanabiliriz.
	// GameCalculator calculator = new WomanGameCalculator();
}
