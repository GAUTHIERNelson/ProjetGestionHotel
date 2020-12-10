import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Graphisme extends JFrame implements ActionListener{
	private int identification ;
	int hauteur;
	int longueur;
	
	
	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}

	public Graphisme (){
		super ("Identification");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		hauteur = 150;
		longueur = 300;
		this.getContentPane().setLayout(null);
		this.setSize(longueur, hauteur);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	/**
	 * Construit la fenetre qui apparait dans le cas ou l'utilisateur c'est identifié correctement
	 * @param idUtilisateur Correspond à l'id de l'utilisateur connecté
	 * @throws SQLException
	 */
	public Graphisme (int idUtilisateur) throws SQLException{
		super ("Gestion Hotel");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setIdentification(idUtilisateur);
		hauteur = 500;
		longueur = 500;
		this.setSize(longueur, hauteur);
		JPanel contentPane = (JPanel) getContentPane();
        contentPane.add( this.menu(contentPane, this.getIdentification()), BorderLayout.NORTH);

		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	/**
	 * Construit le menu avec les boutons (Facture,Client,...)
	 * @param panel Correspond au nom de la variable qui représente le container du menu
	 * @param id	Correspond à l'id de l'utilisateur connecté
	 * @return	Retourne un JToolBar (Menu de la fenetre de Gestion)
	 */
	public JToolBar menu (JPanel panel, int id){
		JToolBar toolBar = new JToolBar ();
		JPanel facture = this.factures();
		JPanel stats = this.stats();
		JPanel client = new Client().clients(id);
		
		//Accé à la page de gestion des factures
        JButton bouton1 = new JButton("Facture");
        toolBar.add( bouton1 );
        bouton1.addActionListener( (event) -> {System.out.println("bouton1"); panel.remove(client);panel.remove(stats);panel.repaint();panel.add(facture, BorderLayout.CENTER);panel.revalidate();});	//Listener bouton Facture
        
        //Accé à la page de gestion des Clients
        JButton bouton2 = new JButton("Client");
        toolBar.add( bouton2 );
        bouton2.addActionListener( (event) -> {System.out.println("bouton2");panel.remove(stats);panel.remove(facture);panel.repaint(); panel.add(client, BorderLayout.CENTER);panel.revalidate();});	//Listener bouton Client
        
        //Accé à la page de gestion des Stats
        JButton bouton3 = new JButton("Stats Mensuel");
        toolBar.add( bouton3 );
        bouton3.addActionListener( (event) -> {System.out.println("bouton3");panel.remove(client);panel.remove(facture);panel.repaint(); panel.add(stats, BorderLayout.CENTER);panel.revalidate();});	//Listener bouton Stats Mensuel
		return toolBar;
	}
	
	public JPanel factures () {
		JPanel facture = new JPanel ();
		JToolBar modes = new JToolBar ();
		
		//Créer une nouvell facture
        JButton boutonFacture1 = new JButton("Créer");
        modes.add(boutonFacture1);
        boutonFacture1.addActionListener( (event) -> {System.out.println("boutonFacture1");});	//Listener bouton pour créer une nouvelle Facture
        
        //Supprimer une facture
        JButton boutonFacture2 = new JButton("Supprimer");
        modes.add( boutonFacture2 );
        boutonFacture2.addActionListener( (event) -> {System.out.println("boutonFacture2");});	//Listener bouton pour supprimer une facture
      
        //Modifier une facture
        JButton boutonFacture3 = new JButton("Modifier");
        modes.add( boutonFacture3 );
        boutonFacture3.addActionListener( (event) -> {System.out.println("boutonFacture3");});	//Listener bouton pour modifier une facture

        facture.setLayout (new BorderLayout ());
        facture.add(modes, BorderLayout.NORTH);
        return facture;
	}
	
	public JPanel stats () {
		JPanel stat = new JPanel ();
		JLabel titreStat = new JLabel ("Les chiffres du mois :");
		stat.add(titreStat);
        return stat;
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		this.dispose();									//Permet de fermer la page d'identification.
		try {
			new Graphisme (true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Graphisme ();
	}

}
