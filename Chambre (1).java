
public class Chambre {
	
	
	
	private int numChambre;
	private int nombrePersonne;
	private int typeChambre;
	private boolean repas ;
	private boolean balcon ;
	private boolean vuePiscine;
	private double tarif;
	
	//les  getters et les setters
	public int getNumChambre() {
		return numChambre;
	}
	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}
	public int getNombrePersonne() {
		return nombrePersonne;
	}
	public void setNombrePersonne(int nombrePersonne) {
		this.nombrePersonne = nombrePersonne;
	}
	public int getTypeChambre() {
		return typeChambre;
	}
	public void setTypeChambre(int typeChambre) {
		this.typeChambre = typeChambre;
	}
	public boolean isRepas() {
		return repas;
	}
	public void setRepas(boolean repas) {
		this.repas = repas;
	}
	public boolean isBalcon() {
		return balcon;
	}
	public void setBalcon(boolean balcon) {
		this.balcon = balcon;
	}
	public boolean isVuePiscine() {
		return vuePiscine;
	}
	public void setVuePiscine(boolean vuePiscine) {
		this.vuePiscine = vuePiscine;
	}
	public double getTarif() {
		return tarif;
	}
	public void setTarif(double tarif) {
		this.tarif = tarif;
	}
	
	
	// constructeur par attributs :
	public Chambre(int numChambre, int nombrePersonne, int typeChambre, boolean repas, boolean balcon,
			boolean vuePiscine, double tarif) {
		super();
		this.numChambre = numChambre;
		this.nombrePersonne = nombrePersonne;
		this.typeChambre = typeChambre;
		this.repas = repas;
		this.balcon = balcon;
		this.vuePiscine = vuePiscine;
		this.tarif = tarif;
	}
	
	
	
	
	//constructeur par defaut
	public Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//methode pour calculer  tarif
	
	/*Pour châque option choisi par le client 
	lord de la réservation augmente d'un certain pourcentage le tarif de base de la chambre*/
	//J'ai choisis les valeurs des pourcentages au hasard et peuvent être modifiées par la suite
	
	public double calculerTarif() {
		if (repas == true)
			tarif += ((tarif/100)*15);
		if (balcon == true)
			tarif += ((tarif/100)*30);
		if (vuePiscine == true)
			tarif += ((tarif/100)*15);
		return tarif;
	}
	
	
	
	
	
	
	

}
