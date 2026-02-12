package cycles;
public class veloElec extends velo {
	private double DEFAUT_FACTEUR_PUISSANCE = 15.0;
	private double facteurPuissanceMoteur ;
	
	public veloElec(double braquet, double diamRoue, double facteurPuissanceMoteur) {
		super(braquet,diamRoue);
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public veloElec(double diamRoue, double facteurPuissanceMoteur) {
		super(diamRoue);                                                                          
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public veloElec() {
		
	}

	public double getDEFAUT_FACTEUR_PUISSANCE() {
		return DEFAUT_FACTEUR_PUISSANCE;
	}

	public void setDEFAUT_FACTEUR_PUISSANCE(double dEFAUT_FACTEUR_PUISSANCE) {
		DEFAUT_FACTEUR_PUISSANCE = dEFAUT_FACTEUR_PUISSANCE;
	}

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}

	public String toString() {
		return "veloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
}