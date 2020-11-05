package com.java.HotelGestion;


public class GroupPersonne extends Categorie {
	
	 public GroupPersonne(int idGroupe,String nomGroupe, int nombrePersonne) {
		super(nombrePersonne);
		this.idGoupe= idGroupe;
		this.nomGrooupe= nomGroupe;
	}
	private int idGoupe;
	 private String nomGrooupe;
	
	
	
	public int getIdGoupe() {
		return idGoupe;
	}
	public void setIdGoupe(int idGoupe) {
		this.idGoupe = idGoupe;
	}
	public String getNomGrooupe() {
		return nomGrooupe;
	}
	public void setNomGrooupe(String nomGrooupe) {
		this.nomGrooupe = nomGrooupe;
	}
	
	
	public String toString() {
		
		return " identifiantGroupe"+getIdGoupe()+"  nomGroupe "+getNomGrooupe()+super.toString();
	}
	@Override
	public double CalculPrix() {
		double montant=0;
		 
		 if ( getNombrePersonne()<= 50) 
			
			 montant= montant-(0.1);
			 if(getNombrePersonne() > 50 )
				 montant= montant-(0.2);
		
		return montant;
	}
	@Override
	public String infoCategorie() {
		
		return " groupe de personne";
	}
}
