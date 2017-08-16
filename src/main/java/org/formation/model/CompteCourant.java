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
@Table(name="compte_courant")
public class CompteCourant extends CompteBancaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCompteCourant;
	
	private double autorisationDecouvert = -1000;
	
	@OneToOne(mappedBy = "compteCourant")
	private Client client;
	
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

	public int getIdCompteCourant() {
		return idCompteCourant;
	}

	public void setIdCompteCourant(int idCompteCourant) {
		this.idCompteCourant = idCompteCourant;
	}

	@Override
	public String toString() {
		return "CompteCourant [idCompteCourant=" + idCompteCourant + ", autorisationDecouvert=" + autorisationDecouvert
				+ "]";
	}

	
	
}
