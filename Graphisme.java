import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Graphisme extends JFrame implements ActionListener{
	private boolean identification = false;
	int hauteur;
	int longueur;
	
	
	public boolean getIdentification() {
		return identification;
	}

	public void setIdentification(boolean identification) {
		this.identification = identification;
	}

	public Graphisme (){
		super ("Identification");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		if (identification == false){
			hauteur = 150;
			longueur = 300;
			this.getContentPane().setLayout(null);
			this.add(identification());
			this.setSize(longueur, hauteur);
		}
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public Graphisme (boolean _identification){
		super ("Gestion Hotel");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setIdentification(_identification);
		if (identification == true){
			hauteur = 500;
			longueur = 500;
			this.setSize(longueur, hauteur);
			JPanel contentPane = (JPanel) getContentPane();
	        contentPane.add( this.menu(contentPane), BorderLayout.NORTH);
		}
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public JPanel identification () {
		//Composants graphiques
		JTextField userId = new JTextField (" Pseudo    ");
		userId.setPreferredSize(new Dimension (100, 25));
		JTextField passWord = new JTextField (" Mot de passe    ");
		passWord.setPreferredSize(new Dimension (100, 25));
		JButton bouton = new JButton("S'identifier");
		bouton.setPreferredSize(new Dimension (100, 25));
		JLabel user = new JLabel("User : ");
		JLabel motDePasse = new JLabel("Mot de passe : ");
		
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
		bouton.addActionListener(this);
		
		panneau.setSize(longueur-20, hauteur-50);
		return panneau;
	}
	
	public JToolBar menu (JPanel panel){
		JToolBar toolBar = new JToolBar ();
		
		//Accé à la page de gestion des factures
        JButton bouton1 = new JButton("Facture");
        toolBar.add( bouton1 );
        bouton1.addActionListener( (event) -> {System.out.println("bouton1"); panel.add(this.factures(), BorderLayout.CENTER);panel.revalidate();});	//Listener bouton Facture
        
        //Accé à la page de gestion des Clients
        JButton bouton2 = new JButton("Client");
        toolBar.add( bouton2 );
        bouton2.addActionListener( (event) -> {System.out.println("bouton2"); panel.add(this.clients(), BorderLayout.CENTER);panel.revalidate();});	//Listener bouton Client
        
        //Accé à la page de gestion des Stats
        JButton bouton3 = new JButton("Stats Mensuel");
        toolBar.add( bouton3 );
        bouton3.addActionListener( (event) -> {System.out.println("bouton3"); panel.add(this.stats(), BorderLayout.CENTER);panel.revalidate();});	//Listener bouton Stats Mensuel
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
	
	public JPanel clients () {
		JPanel client = new JPanel ();
		JToolBar modes = new JToolBar ();
		
		//Créer un nouveau client
        JButton boutonClient1 = new JButton("Créer");
        modes.add(boutonClient1);
        boutonClient1.addActionListener( (event) -> {System.out.println("boutonClient1");});	//Listener bouton pour créer un nouveau Client
        
        //Supprimer un client
        JButton boutonClient2 = new JButton("Supprimer");
        modes.add( boutonClient2 );
        boutonClient2.addActionListener( (event) -> {System.out.println("boutonClient2");});	//Listener bouton pour supprimer un Client
      
        //Modifier un client
        JButton boutonClient3 = new JButton("Modifier");
        modes.add( boutonClient3 );
        boutonClient3.addActionListener( (event) -> {System.out.println("boutonClient3");});	//Listener bouton pour modifier un Client

        client.setLayout (new BorderLayout ());
        client.add(modes, BorderLayout.NORTH);
        return client;
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
		new Graphisme (true);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Graphisme ();
	}

}
