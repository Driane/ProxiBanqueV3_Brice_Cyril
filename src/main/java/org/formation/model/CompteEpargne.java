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
@Table(name="compte_epargne")
public class CompteEpargne implements Serializable {

	private static final long serialVersionUID = -4508570332146243577L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCompteEpargne;
	
	double tauxRemuneration = 0.03;
	private double soldeCompteEpargne;
	private Date dateOuvertureCompteEpargne;
	private String numeroCompteEpargne;
	
	@OneToOne(mappedBy = "compteEpargne")
	private Client client;



	public CompteEpargne(double soldeCompteEpargne, Date dateOuvertureCompteEpargne, String numeroCompteEpargne) {
		super();
		this.soldeCompteEpargne = soldeCompteEpargne;
		this.dateOuvertureCompteEpargne = dateOuvertureCompteEpargne;
		this.numeroCompteEpargne = numeroCompteEpargne;
	}

	public CompteEpargne(double tauxRemuneration, double soldeCompteEpargne, Date dateOuvertureCompteEpargne,
			String numeroCompteEpargne) {
		super();
		this.tauxRemuneration = tauxRemuneration;
		this.soldeCompteEpargne = soldeCompteEpargne;
		this.dateOuvertureCompteEpargne = dateOuvertureCompteEpargne;
		this.numeroCompteEpargne = numeroCompteEpargne;
	}

	public CompteEpargne() {
		super();
	}

	
	
	public double getSoldeCompteEpargne() {
		return soldeCompteEpargne;
	}

	public void setSoldeCompteEpargne(double soldeCompteEpargne) {
		this.soldeCompteEpargne = soldeCompteEpargne;
	}

	public Date getDateOuvertureCompteEpargne() {
		return dateOuvertureCompteEpargne;
	}

	public void setDateOuvertureCompteEpargne(Date dateOuvertureCompteEpargne) {
		this.dateOuvertureCompteEpargne = dateOuvertureCompteEpargne;
	}

	public String getNumeroCompteEpargne() {
		return numeroCompteEpargne;
	}

	public void setNumeroCompteEpargne(String numeroCompteEpargne) {
		this.numeroCompteEpargne = numeroCompteEpargne;
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

	@Override
	public String toString() {
		return "CompteEpargne [idCompteEpargne=" + idCompteEpargne + ", tauxRemuneration=" + tauxRemuneration
				+ ", soldeCompteEpargne=" + soldeCompteEpargne + ", dateOuvertureCompteEpargne="
				+ dateOuvertureCompteEpargne + ", numeroCompteEpargne=" + numeroCompteEpargne + "]";
	}


	
		
	
	
}
