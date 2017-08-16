package org.formation.model;

import java.util.Date;

public class CompteEpargne extends CompteBancaire {


	double tauxRemuneration = 0.03;

	public CompteEpargne(double soldeCompte, Date dateOuverture, String numeroCompte) {
		super(soldeCompte, dateOuverture, numeroCompte);
	}

	public CompteEpargne(double soldeCompte, Date dateOuverture, String numeroCompte, double tauxRemuneration) {
		super(soldeCompte, dateOuverture, numeroCompte);
		this.tauxRemuneration = tauxRemuneration;
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return "CompteEpargne [tauxRemuneration=" + tauxRemuneration + "]";
	}
	
	
	
	
}
