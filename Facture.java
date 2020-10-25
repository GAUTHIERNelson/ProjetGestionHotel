import java.util.Date;

public class Facture {
	
	private String idFacture;
	private Date dateFacture;
	private int montant;
	
	//les  getters et les setters
	public String getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(String idFacture) {
		this.idFacture = idFacture;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	
	
	// constructeur par attributs :

	public Facture(String idFacture, Date dateFacture, int montant) {
		super();
		this.idFacture = idFacture;
		this.dateFacture = dateFacture;
		this.montant = montant;
	}
	
	//constructeur par defaut
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
