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
	 * Etablie la connection avec la base qui correspond � url, login et password
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
	 * R�alise une recherche dans la base de donn�e pour des requ�tes renvoyant une chaine de caract�re
	 * @param requete Repr�sente la requete � soumettre � la base de donn�e en SQL.
	 * @param attribut Repr�sente l'attribut devant �tre renvoy� par la requ�te
	 * @return retourne une chaine de caract�re correspondant au r�sultat de la requ�te
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
	 * R�alise une recherche dans la base de donn�e pour des requ�tes renvoyant un ArrayList
	 * @param requete Repr�sente la requete � soumettre � la base de donn�e en SQL.
	 * @param attribut Repr�sente l'attribut devant �tre renvoy� par la requ�te
	 * @return retourne un ArrayList correspondant au r�sultat de la requ�te
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
	 * R�alise une recherche dans la base de donn�e pour des requ�tes renvoyant un entier
	 * @param requete Repr�sente la requete � soumettre � la base de donn�e en SQL.
	 * @param attribut Repr�sente l'attribut devant �tre renvoy� par la requ�te
	 * @return retourne une valeur enti�re correspondant au r�sultat de la requ�te
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
	 * R�alise un ajout ou une modification aux donn�es de la base
	 * @param requete Repr�sente la requete � soumettre � la base de donn�e en SQL.
	 * @return retourne une valeur bool�enne true en cas de succ�.
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
