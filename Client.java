public class Client {
	
	private int idClient;

	private String adresse;

	private int telephone;

	private String email;

	private String nom;

	private String prenom;

	public Client(int idClient, String adresse, int telephone, String email, String nom, String prenom) {
		
		this.idClient = idClient;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}
	

	public int getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public int getTelephone() {
		return telephone;
	}


	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
