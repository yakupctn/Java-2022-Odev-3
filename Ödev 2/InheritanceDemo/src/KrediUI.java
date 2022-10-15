
public class KrediUI {
	public void KrediHesapla(BaseKrediManager baseKrediManager) {        
		baseKrediManager.hesapla();                                    
	}
	
	// Bu metoda gelen parametre ya BaseKrediManager tipinde ya da BaseKrediManager sınıfını miras alımış
	// bir sınıfın tipinde olmalı. Yani TarimKrediManager, OgretmenKrediManager ve AskerKrediManager
	// tipli parametre de olur. Bu kalıtımın bir faydasıdır.S
}
