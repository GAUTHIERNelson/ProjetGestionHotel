package com.java.HotelGestion;

public abstract  class Categorie {
	 private int nombrePersonne;
	
	 public Categorie(int nombrePersonne) {
		 
	this.nombrePersonne= nombrePersonne;
	
	
	}
	 public Categorie() {
		// TODO Auto-generated constructor stub
	}

	 public int getNombrePersonne() {
		return nombrePersonne;
	}

	public void setNombrePersonne(int nombrePersonne) {
		this.nombrePersonne = nombrePersonne;
	}



	

	
	public abstract  String infoCategorie();
	public abstract double CalculPrix();
	
	public  String toString () {
		
		return "  nombrePersonne :"+getNombrePersonne();
	}
}
