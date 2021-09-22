public class TestBanka {
	public static void main(String[] args) {
		Klijent klijent;
		Banka banka = new Banka();
		
		// klijenti banke
		banka.addKlijent("Jure", "Simic");
		klijent = banka.getKlijent(0);
		klijent.addRacun(new StedniRacun(500.00, 0.05));
		klijent.addRacun(new TekuciRacun(200.00, 500.00));
		banka.addKlijent("Ana", "Kovac");
		
		klijent = banka.getKlijent(1);
		klijent.addRacun(new StedniRacun(200.00, 0.03));
		
		// 1. klijent
		klijent = banka.getKlijent(0);
		
		// racuni
		klijent.getRacun(0).getStanje();
		klijent.getRacun(1).getStanje();
		
		// transakcije
		klijent.getRacun(0).podigni(50.00);
		klijent.getRacun(1).podigni(150.00);
		klijent.getRacun(1).uplati(45.50);
		klijent.getRacun(0).uplati(55.00);
		klijent.getRacun(1).podigni(117.62);
		klijent.getRacun(0).podigni(150.00);
		klijent.getRacun(1).podigni(97.62);
		klijent.getRacun(1).podigni(470.00);
		klijent.getRacun(0).podigni(20.00);
		klijent.getRacun(1).uplati(443.50);
		klijent.getRacun(1).podigni(470.00);
		klijent.getRacun(0).getStanje();
		klijent.getRacun(1).getStanje();
		System.out.println();
		
		//2. klijent
		klijent = banka.getKlijent(1);
		
		// racun
		klijent.getRacun(0).getStanje();
		
		// transakcije
		klijent.getRacun(0).podigni(100.00);
		klijent.getRacun(0).uplati(25.00);
		klijent.getRacun(0).podigni(175.00);
		klijent.getRacun(0).getStanje();
	}
}
