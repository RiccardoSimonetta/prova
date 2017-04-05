package dipendente;
 //adasfsa
class DipendenteA extends Dipendente{
	private int malattia=0;
	
	public DipendenteA(String matricola, double stipendio, double straordinario){
		super(matricola, stipendio, straordinario);
	}
	
	public void prendiMalattia(int giorni_malattia){
		this.malattia+=giorni_malattia;
	}
	
	public double paga(int ore_straordinario){
		return super.paga(ore_straordinario)-malattia*15;
	}
	
	void stampaMalattia(){
		System.out.println("Giorni di malattia: "+malattia);
	}
}
