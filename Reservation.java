import java.util.Date;

public class Reservation {
	
	private int idReservation;

	private Date dateReservation;

	private Date dateDepart;

	private Date dateArrivee;
	
	

	public Reservation(int idReservation, Date dateReservation, Date dateDepart, Date dateArrivee) {
		
		this.idReservation = idReservation;
		this.dateReservation = dateReservation;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
	}

	public int getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
