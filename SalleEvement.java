package com.java.HotelGestion;

public class SalleEvement  extends Categorie{
	// une classe salleEvenement   
	
	
	private   int idSalle ;// un attribut identifiant pour salle d'évenement  de type integer
	
	 private  double metreCarre  ; // le nombre de metre carree d'une salle 
	 
		 private double prixMetre= 0;// prix du metre 
	


	public SalleEvement(int idSalle ,int nombrePersonne) {
		
		
		
		super(nombrePersonne);
	this.idSalle= idSalle;
	}
public SalleEvement() {
	
}

	

	// return l'identifiant de la salle 
	public int getIdSalle() {
		return idSalle;
	}

	public double getMetreCarre() {
		return metreCarre;
	}


	public void setMetreCarre(double metreCarre) {
		this.metreCarre = metreCarre;
	}
	 


	public double getPrixMetre() {
		return ((getNombrePersonne()/metreCarre));
	}


	public void setPrixMetre(double prixMetre) {
		
			  
		this.prixMetre = prixMetre;
		 
	}
	
			 
		
	 

	@Override
	/* cette methode permet de calcule le prix  d'une salle 
	
	en fonction du  m2 avec un taux de 10% et 20% selon le nombre de personne
	
	*/
	public double CalculPrix() {
		
	double  totalPrix =0;
		 
		 if ( getNombrePersonne()<= 50) 
			 totalPrix= metreCarre*getPrixMetre()/0.1;
			    
			 if(getNombrePersonne() > 50 )
				 totalPrix= metreCarre*getPrixMetre()/0.2;
		
			 
		return totalPrix;
	}



	@Override
	
	// cette methode permet  d'affiche un message sur la salle
	
	public String infoCategorie() {
		// TODO Auto-generated method stub
		return" salle d'evenement "   ;
	}
	
	
	
	// affiche les information de la salle
public  String toString () {
	
	 return "  Idsalle"+getIdSalle()+"\n MetreCarre : "  +getMetreCarre()+"\n prixMettre" +getPrixMetre()+ super.toString();
	 
	 
}
}
