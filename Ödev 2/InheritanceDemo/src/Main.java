
public class Main {

	public static void main(String[] args) {
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		
		tarimKrediManager.hesapla();
		
		System.out.println();
		
		
		KrediUI krediUI = new KrediUI();
		
		krediUI.KrediHesapla(ogretmenKrediManager);
		krediUI.KrediHesapla(new OgretmenKrediManager());   // => Bu kod ile bir üstteki kod tamamen aynıdır.
		krediUI.KrediHesapla(new TarimKrediManager());
		krediUI.KrediHesapla(new BaseKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
