 class Banka {
	
	private Klijent[] klijenti = new Klijent[10];
	private static int brojKlijenata = 0;
	
	public void addKlijent(String ime, String prezime ){
		klijenti[brojKlijenata++] = new Klijent(ime, prezime);
		
	}
	
	public int getBrojKlijenata(){
		return brojKlijenata;
	}
	
	Klijent getKlijent(int index){
		return klijenti[index];
	}
	
	public Banka(){
	}
}
