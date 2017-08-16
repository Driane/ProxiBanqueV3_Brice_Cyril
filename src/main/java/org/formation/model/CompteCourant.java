package org.formation.model;

import java.util.Date;

public class CompteCourant extends CompteBancaire {

	private double autorisationDecouvert = -1000;
	
	public CompteCourant(double soldeCompte, Date dateOuverture, String numeroCompte) {
		super(soldeCompte, dateOuverture, numeroCompte);
	}

	public CompteCourant(double soldeCompte, Date dateOuverture, String numeroCompte, double autorisationDecouvert) {
		super(soldeCompte, dateOuverture, numeroCompte);
		this.autorisationDecouvert = autorisationDecouvert;
	}

	public double getAutorisationDecouvert() {
		return autorisationDecouvert;
	}

	public void setAutorisationDecouvert(double autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [autorisationDecouvert=" + autorisationDecouvert + "]";
	}

	
	
	
}
