class Racun{
	protected double stanje = 0.0;
	
	protected Racun(double s){
		stanje = s;
	}
	
	public double getStanje(){
		return stanje;
	}
	
	public void uplati(double iznos){
		stanje += iznos;
		System.out.println(" Racun - upla�eno " + iznos + " kn");
	}
	
	public void podigni(double iznos){
		stanje -= iznos;
		System.out.println(" Racun - podignuto " + iznos + " kn");
	}
	
	
}//da, u klasi teku�i ra�un radi� svoju implementaciju metode podigni()
//jer u teku�em ra�unu imamo i minus pa moramo i to imati na umu
