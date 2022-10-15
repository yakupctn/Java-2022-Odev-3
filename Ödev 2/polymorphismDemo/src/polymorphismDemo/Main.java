package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger [] Logger = new BaseLogger [] {new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()}; 
		// => Üstteki kodda BaseLogger tipinde bir dizi tanımladık ve dizi elemanı olarak üç tane nesne tanımladık.
        // Dikkat => Logger dizisi BaseLogger tipinde olmasına rağmen farklı tipte elemanlar alabilmiş çünkü bu elemanların hepsi BaseLogger sınıfından miras almış.
	    //            Bu sayede onlar da BaseLogger tip gibi davranabiliyorlar. Referans type özelliği
		
		for(BaseLogger logger:Logger) {
			logger.log("Log mesajı");
		}
		
		System.out.println("-    -     -  ");
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());  // Normalde buraya BaseLogger tipinde paramere girmeliydik ama DatabaseLogger tipinde girmişiz.
		customerManager.add();                                                         // DatabaseLogger sınıfı BaseLogger sınıfını miras aldığı için bunu gerçekleştirebiliyoruz.
	}

}
