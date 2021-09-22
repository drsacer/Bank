class StedniRacun extends Racun {
	private double kamata;
	
	public StedniRacun(double pocetnoStanje, double kamata){
		stanje = pocetnoStanje; //stanje je vidljiva varijabla jer je protected u klasi Racun
		this.kamata = kamata; 
	}
}
