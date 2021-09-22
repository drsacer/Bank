class Klijent{
	private String ime;
	private String prezime;
	private Racun[] racuni = new Racun[10];
	private int brojRacuna=0;
	
	public Klijent(String i, String p){
		this.ime = i;
		this.prezime = p;
	}
	
	public String getIme(){
		return ime;
	}
	
	public String getPrezime(){
		return prezime;
	}
	
	public void addRacun(Racun racun){
		racuni[brojRacuna++] = racun;
		
	}
	
	public Racun getRacun(int index){
		return racuni[index];
	}
	
	public int getBrojRacuna(){
		return brojRacuna;
	}
	
	
	
}
