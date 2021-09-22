class TekuciRacun extends Racun{
	private double dozvoljenMinus;
	
	public TekuciRacun(double pocetnoStanje){
	}
	
	public TekuciRacun(double pocetnoStanje, double dozvoljenMinus){
		this.dozvoljenMinus = dozvoljenMinus;
		this.stanje = pocetnoStanje;
		
	}
	
	public void podigni(double iznos){
		stanje -= iznos;
		System.out.println("Teku�i Racun - podignuto " + iznos + " kn");
		if (stanje < dozvoljenMinus * -1) {
			System.out.println("Teku�i Racun - *** Nedozvoljno sredstava " + (stanje - (dozvoljenMinus * -1)) + " *** -");
		}
	}
	
}
