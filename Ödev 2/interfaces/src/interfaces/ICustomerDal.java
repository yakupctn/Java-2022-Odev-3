package interfaces;

public interface ICustomerDal {
	void add();      // => Tamamlanmamış metod => Bunu implements eden sınıf kendine göre tamamlayacak.

	
	
	/*   NOTLAR:
	 * 1 => Sınıflar sadece bir sınıfı miras alabilir ama istediği kadar interface implements edebilir.
	 * 2 => İnterface içinde sadece tamamlanmamış (gövdesiz) metodlar bulunabilir.
	 * 3 => Bir interface'i implements eden sınıf, o interface içindeki gövdesiz metodları override etmek zorundadır.
	 * 4 => İnterfaceler de abstract classlar gibi new'lenemezler. Yani interface nesnesi oluşturamayız.
	 * 
	 * */

}
