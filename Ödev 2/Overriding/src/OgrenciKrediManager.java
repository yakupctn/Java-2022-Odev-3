
public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
	
	// Overriding => Bir sınıf miras almış olduğu sınıfın bir metodunu kopya yapıp
	// yapıp kullanabilir ve kendine göre özelleştirebilir yani miras aldığı sınıfı ezebilir buna Override denir.
}
