package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vadesiz işlemler";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun < dolarDun) {
			
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} else if(dolarBugun > dolarDun) {
			
			okYonu = "up.svg";
			System.out.println(okYonu);
			
		} else {
			
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		// array listeler
		
		String[] krediler = {"Hızlı Kredi", "Emekli Kredi", "Maaşlı Kredi", "Hazır Kredi"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		

	}

}
