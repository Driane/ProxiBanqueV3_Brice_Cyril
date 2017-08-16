package org.formation.model;

import java.util.Date;

public abstract class CompteBancaire {

	private double soldeCompte;
	private Date dateOuverture;
	private String numeroCompte;
	
	public CompteBancaire(double soldeCompte, Date dateOuverture, String numeroCompte) {
		super();
		this.soldeCompte = soldeCompte;
		this.dateOuverture = dateOuverture;
		this.numeroCompte = numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	@Override
	public String toString() {
		return "CompteBancaire [soldeCompte=" + soldeCompte + ", dateOuverture=" + dateOuverture + ", numeroCompte="
				+ numeroCompte + "]";
	}
	
	
	
}
