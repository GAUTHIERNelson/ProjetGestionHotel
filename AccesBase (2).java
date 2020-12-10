import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class AccesBase {
	private String url ="jdbc:mysql://localhost:3306/gestionhotel";
	private String login ="Nelson";
	private String password ="02032000";
	private Connection cn = null ;
	private Statement st = null ;

	/**
	 * Etablie la connection avec la base qui correspond à url, login et password
	 */
	public AccesBase () {
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    cn = DriverManager.getConnection(url, login, password);
		    System.out.println("Connecter");
		} catch (Exception e){
		    e.printStackTrace();
		    System.out.println("Erreur");
		    System.exit(0);
		}
	}
	/**
	 * Réalise une recherche dans la base de donnée pour des requétes renvoyant une chaine de caractére
	 * @param requete Représente la requete à soumettre à la base de donnée en SQL.
	 * @param attribut Représente l'attribut devant être renvoyé par la requète
	 * @return retourne une chaine de caractére correspondant au résultat de la requète
	 * @throws SQLException
	 */
	
	public String demande (String requete,String attribut) throws SQLException{
		try {
			st = (Statement) cn.createStatement () ;
			ResultSet res = ((java.sql.Statement) st).executeQuery (requete) ;
			res.next();
			return (String)res.getString(attribut);
		} 
		catch ( Exception e ) {
			e . printStackTrace () ;
			return "";
		}
	}
	
	/**
	 * Réalise une recherche dans la base de donnée pour des requétes renvoyant un ArrayList
	 * @param requete Représente la requete à soumettre à la base de donnée en SQL.
	 * @param attribut Représente l'attribut devant être renvoyé par la requète
	 * @return retourne un ArrayList correspondant au résultat de la requète
	 * @throws SQLException
	 */
	
	public ArrayList demandes (String requete,String attribut) throws SQLException{
		ArrayList listResultat = new ArrayList ();
		try {
			st = (Statement) cn.createStatement () ;
			ResultSet res = ((java.sql.Statement) st).executeQuery (requete) ;
			
			while (res.next())
            {
				listResultat.add((String)res.getString(attribut));
             }
			return listResultat;
		} 
		catch ( Exception e ) {
			e . printStackTrace () ;
			return listResultat;
		}
	}
	/**
	 * Réalise une recherche dans la base de donnée pour des requétes renvoyant un entier
	 * @param requete Représente la requete à soumettre à la base de donnée en SQL.
	 * @param attribut Représente l'attribut devant être renvoyé par la requète
	 * @return retourne une valeur entiére correspondant au résultat de la requète
	 * @throws SQLException
	 */
	public int demandeInt (String requete,String attribut) throws SQLException{
		try {
			st = (Statement) cn.createStatement () ;
			ResultSet res = ((java.sql.Statement) st).executeQuery (requete) ;
			res.next();
			return (int)res.getInt(attribut);
		} 
		catch ( Exception e ) {
			e . printStackTrace () ;
			return -1;
		}
	}
	
	/**
	 * Réalise un ajout ou une modification aux données de la base
	 * @param requete Représente la requete à soumettre à la base de donnée en SQL.
	 * @return retourne une valeur booléenne true en cas de succé.
	 * @throws SQLException
	 */
	public boolean newData (String requete) throws SQLException{
		try {
			st = (Statement) cn.createStatement () ;
			int res = ((java.sql.Statement) st).executeUpdate(requete) ;
			return true;
		} 
		catch ( Exception e ) {
			e . printStackTrace () ;
			return false;
		}
	}
    public static void main(String[] args) {
    	AccesBase a = new AccesBase ();
    }
}
