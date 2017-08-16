package org.formation.model;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@ManagedBean
@Table(name="compte_courant")
public class CompteCourant implements Serializable {

	private static final long serialVersionUID = 8130439753050031072L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCompteCourant;
	
	private double autorisationDecouvert = -1000;
	private double soldeCompteCourant;
	private Date dateOuvertureCompteCourant;
	private String numeroCompteCourant;
	
	@OneToOne(mappedBy = "compteCourant")
	private Client client;
	

	
	public CompteCourant(double soldeCompteCourant, Date dateOuvertureCompteCourant, String numeroCompteCourant) {
		super();
		this.soldeCompteCourant = soldeCompteCourant;
		this.dateOuvertureCompteCourant = dateOuvertureCompteCourant;
		this.numeroCompteCourant = numeroCompteCourant;
	}


	public CompteCourant(double autorisationDecouvert, double soldeCompteCourant, Date dateOuvertureCompteCourant,
			String numeroCompteCourant) {
		super();
		this.autorisationDecouvert = autorisationDecouvert;
		this.soldeCompteCourant = soldeCompteCourant;
		this.dateOuvertureCompteCourant = dateOuvertureCompteCourant;
		this.numeroCompteCourant = numeroCompteCourant;
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


	public double getAutorisationDecouvert() {
		return autorisationDecouvert;
	}

	public void setAutorisationDecouvert(double autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}

	public int getIdCompteCourant() {
		return idCompteCourant;
	}


	@Override
	public String toString() {
		return "CompteCourant [idCompteCourant=" + idCompteCourant + ", autorisationDecouvert=" + autorisationDecouvert
				+ ", soldeCompteCourant=" + soldeCompteCourant + ", dateOuvertureCompteCourant="
				+ dateOuvertureCompteCourant + ", numeroCompteCourant=" + numeroCompteCourant + "]";
	}



	
	
}
