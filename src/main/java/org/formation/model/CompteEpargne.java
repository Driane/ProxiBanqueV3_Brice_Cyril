package org.formation.model;

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
@Table(name="compte_epargne")
public class CompteEpargne extends CompteBancaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCompteEpargne;
	
	double tauxRemuneration = 0.03;
	
	@OneToOne(mappedBy = "compteEpargne")
	private Client client;

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

	public int getIdCompteEpargne() {
		return idCompteEpargne;
	}

	public void setIdCompteEpargne(int idCompteEpargne) {
		this.idCompteEpargne = idCompteEpargne;
	}

	@Override
	public String toString() {
		return "CompteEpargne [idCompteEpargne=" + idCompteEpargne + ", tauxRemuneration=" + tauxRemuneration + "]";
	}

		
	
	
}
