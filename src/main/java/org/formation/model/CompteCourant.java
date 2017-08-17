package org.formation.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * 
 * @author Brice Adelin/Cyril Rabineau
 *Permet de créer un compte courant d'un client
 */
@Entity
@ManagedBean
@Table(name="compte_courant")
public class CompteCourant implements Serializable {

	private static final long serialVersionUID = 8130439753050031072L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCompteCourant", nullable = false, unique = true)
	private int idCompteCourant;
	
	private double autorisationDecouvert = -1000;
	private double soldeCompteCourant;
	private Date dateOuvertureCompteCourant;
	private String numeroCompteCourant;
	
	@OneToOne(mappedBy = "compteCourant", fetch=FetchType.EAGER)
	private Client client;
	


	
	
	public CompteCourant(double soldeCompteCourant, Date dateOuvertureCompteCourant, Client client) {
		super();
		this.soldeCompteCourant = soldeCompteCourant;
		this.dateOuvertureCompteCourant = dateOuvertureCompteCourant;
		this.client = client;
		this.numeroCompteCourant = creationNumeroCompteCourant(client, dateOuvertureCompteCourant);
	}




	public CompteCourant(double soldeCompteCourant, Date dateOuvertureCompteCourant) {
		super();
		this.soldeCompteCourant = soldeCompteCourant;
		this.dateOuvertureCompteCourant = dateOuvertureCompteCourant;
	}


	public CompteCourant(double autorisationDecouvert, double soldeCompteCourant, Date dateOuvertureCompteCourant) {
		super();
		this.autorisationDecouvert = autorisationDecouvert;
		this.soldeCompteCourant = soldeCompteCourant;
		this.dateOuvertureCompteCourant = dateOuvertureCompteCourant;
	}


	public CompteCourant() {
		super();
	}

	
	public double getSoldeCompteCourant() {
		return soldeCompteCourant;
	}


	public void setSoldeCompteCourant(double soldeCompteCourant) {
		this.soldeCompteCourant = soldeCompteCourant;
	}


	public Date getDateOuvertureCompteCourant() {
		return dateOuvertureCompteCourant;
	}


	public void setDateOuvertureCompteCourant(Date dateOuvertureCompteCourant) {
		this.dateOuvertureCompteCourant = dateOuvertureCompteCourant;
	}


	public String getNumeroCompteCourant() {
		return numeroCompteCourant;
	}


	public void setNumeroCompteCourant(String numeroCompteCourant) {
		this.numeroCompteCourant = numeroCompteCourant;
	}

	public String creationNumeroCompteCourant(Client client, Date dateOuvertureCompteCourant) {
		Calendar cal = Calendar.getInstance();
	    cal.setTime(dateOuvertureCompteCourant);
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH);
	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    int min = cal.get(Calendar.MINUTE);
	    int sec = cal.get(Calendar.SECOND);
		StringBuilder sb = new StringBuilder();
		sb.append(client.getNom().substring(0, 1).toUpperCase());
		sb.append(client.getPrenom().substring(0, 1).toUpperCase());
		sb.append("-");
		sb.append(year);
		sb.append(month);
		sb.append(day);
		sb.append(min);
		sb.append(sec);
		sb.append("-CC");
		String nouveauNumeroCompteCourant = sb.toString();
		return nouveauNumeroCompteCourant;
	}
	

	public double getAutorisationDecouvert() {
		return autorisationDecouvert;
	}

	public void setAutorisationDecouvert(double autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}

	public int getIdCompteCourant() {
		return idCompteCourant;
	}
	
	


	public Client getClient() {
		return client;
	}




	public void setClient(Client client) {
		this.client = client;
	}




	@Override
	public String toString() {
		return "CompteCourant [idCompteCourant=" + idCompteCourant + ", autorisationDecouvert=" + autorisationDecouvert
				+ ", soldeCompteCourant=" + soldeCompteCourant + ", dateOuvertureCompteCourant="
				+ dateOuvertureCompteCourant + ", numeroCompteCourant=" + numeroCompteCourant + "]";
	}



	
	
}
