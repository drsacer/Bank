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
		System.out.println(" Racun - uplaæeno " + iznos + " kn");
	}
	
	public void podigni(double iznos){
		stanje -= iznos;
		System.out.println(" Racun - podignuto " + iznos + " kn");
	}
	
	
}//da, u klasi tekuæi raèun radiš svoju implementaciju metode podigni()
//jer u tekuæem raèunu imamo i minus pa moramo i to imati na umu
