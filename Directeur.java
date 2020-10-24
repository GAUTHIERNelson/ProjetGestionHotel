
public class Directeur extends Utilisateur implements Accueil {
	private int idUtilisateur;
	private String role;
	
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	
	//Constructeur class
	public Directeur(String _nomUser, String _prenomUser, String _login,String _password, int _idUtilisateur, String _role) {
		super(_nomUser, _prenomUser, _login, _password);
		idUtilisateur = _idUtilisateur;
		role = _role;
	}
	
	
	//ci-dessous méthodes interfaces Accueil
	public void ajouterClient (){};
	
	public void modifierClient (){};
	
	public void supprimerClient (){};
	
	public void ajouterReserveChambre (){};
	
	public void modifierReserveChambre (){};
	
	public void supprimerReserveChambre (){};
	
	public void ajouterFacture (){};
	
	public void modifierFacture (){};
	
	public void supprimerFacture (){};
	
	public void chercherClient (){};
	
	public void chercherReserve (){};
	
	public void chercherChambre (){};
	
	public void chercherFacture (){};
	
	//ci-dessus méthodes interfaces Accueil
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
