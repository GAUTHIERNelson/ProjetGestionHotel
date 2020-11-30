package com.java.HotelGestion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Statistique {
	
	
	 private Date dateDebut;
	 private Date dateFin;
	 
	 List<Reservation>point;// une liste de client
	 
	public Statistique( Date dateDebut,Date dateFin) {
		 this.dateDebut= dateDebut;
		 this.dateFin= dateFin;
		 List<Reservation>list1= new ArrayList<Reservation>();// initialisation de ma liste nomée point
		 
		
	}
	// deuxieme construteur 
	public Statistique() {
		
	}
	/* cette methode  return direct la date courant ainsi que l'heur de debut */
	public Date getDateDebut() {
		
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(format.format(date));
		return dateDebut;
	}
	// cette methode return la date de fin
	
	public Date getDateFin() {
		return dateFin;
	}
	
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	//cette methode return la date de debut et fin
	public String toString() {
		
		return "  dateDebut" +getDateDebut()+" dateFin"+getDateFin();
	}
 // cette methode calcul le point de la fin de jours 
	public double  CalulePrixJours() {
		
		  
		
		return  0; //point.stream().filter(x-> x instanceof Reservation).mapToInt(x->(Reservation)X).sum()	 ;
	}
	// cette methode calcul le point de la fin du mois  
	public double  CalulePrixMensuel() {
		 return 0;// point.stream().filter(x-> x instanceof Reservation).mapToInt(x->(Reservation)X).CalulePrixJours().sum();
		
	}
	 public double  calculPrixAnnuel() {
		 
		 return 0;//point.stream().filter(x-> x instanceof Reservation).mapToInt(x->(Reservation)X).CalulePrixMensuel().sum();	
	 }
}
