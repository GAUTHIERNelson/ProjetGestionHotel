package com.java.HotelGestion;

public class uilisatteur {
	private String nomUser;
	
	private String prenomUser;
	 private String login;
	 private String password;
	 
	public uilisatteur(String nomUser,String prenomUser ,String login ,String password ) {
		this.nomUser= nomUser;

		this.prenomUser= prenomUser;

		this.login= login;

		this.password=password;

	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public  String toString() {
		
		return "  nomUser"+getNomUser()+"\n prenomUser"+getPrenomUser()+" \n login"+getLogin()+" \n password"+getPassword();
	}
	
}
