import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Identification extends JFrame implements ActionListener{
	private int identification ;
	int hauteur;
	int longueur;
	
	public int isIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}
	
	/**
	 * Construit la petite fenetre d'identification
	 * @param _hauteur Hauteur de la fenetre
	 * @param _longueur Longueur de la fenetre
	 */
	
	public Identification (int _hauteur, int _longueur){
		//Composants graphiques
		super ("Identification");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		hauteur = _hauteur;
		longueur = _longueur;
		JTextField userId = new JTextField (" Pseudo    ");
		String pseudo = userId.getText();
		userId.setPreferredSize(new Dimension (100, 25));
		JTextField passWord = new JTextField (" Mot de passe    ");
		passWord.setPreferredSize(new Dimension (100, 25));
		JButton bouton = new JButton("S'identifier");
		bouton.setPreferredSize(new Dimension (100, 25));
		JLabel user = new JLabel("   User : ");
		JLabel motDePasse = new JLabel("   Mot de passe : ");
		
		//Panneaux
		JPanel panneau = new JPanel ();
		JPanel panneauInformationUser = new JPanel ();
		JPanel panneauInterractionUser = new JPanel ();

		//Stratégie de placement
		panneau.setLayout(new GridLayout(1, 2, 15, 15));
		panneauInformationUser.setLayout(new GridLayout(3, 1, 15, 15));
		panneauInterractionUser.setLayout(new GridLayout(3, 1, 15, 15));
		
		//Contenue panneauInformationUser
		panneauInformationUser.add(user);
		panneauInformationUser.add(motDePasse);
		
		//Contenus panneauInterractionUser
		panneauInterractionUser.add(userId);
		panneauInterractionUser.add(passWord);
		panneauInterractionUser.add(bouton);
		
		//Ajout des sous panneaux à panneau
		panneau.add(panneauInformationUser);
		panneau.add(panneauInterractionUser);
		
		//Ajout des Listeneurs
		bouton.addActionListener ( (event) -> {System.out.println("S'identifier");
											  AccesBase con = new AccesBase();
											  String reqId1 = "SELECT Prenom FROM `utilisateur` WHERE Login = \""+ userId.getText()+"\"";
											  String reqId2 = "SELECT Prenom FROM `utilisateur` WHERE Password = \""+ passWord.getText()+"\"";
											  String reqId3 = "SELECT IdUtilisateur FROM `utilisateur` WHERE Login = \""+ userId.getText()+"\" AND Password = \""+ passWord.getText()+"\"";
											  try {
												  String str1 = con.demande(reqId1,"Prenom");
												  String str2 = con.demande(reqId2,"Prenom");
												  int str3 = con.demandeInt(reqId3,"IdUtilisateur");
												  System.out.println("str1 = "+str1);
												  if (str1.equals(str2) && str1 != ""){
													    this.dispose();
														new Graphisme (str3);
												  }
											  } catch (Exception e) {
												  // TODO Auto-generated catch block
												  this.dispose();
												  new Identification(150, 300);
											  }});	//Listener bouton d'identification
		
		panneau.setSize(longueur-20, hauteur-50);
		this.getContentPane().setLayout(null);
		this.add(panneau);
		this.setSize(longueur, hauteur);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Identification(150, 300);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
