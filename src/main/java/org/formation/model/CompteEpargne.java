package org.formation.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.SelectBeforeUpdate;
/**
 * 
 * @author Brice Adelin/Cyril Rabineau
 * Permet de créer un compté épargne à un client
 */
@Entity
@SelectBeforeUpdate
@ManagedBean
@Table(name="compte_epargne")
public class CompteEpargne implements Serializable {

	private static final long serialVersionUID = -4508570332146243577L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCompteEpargne", nullable = false, unique = true)
	private int idCompteEpargne;
	
	double tauxRemuneration = 0.03;
	private double soldeCompteEpargne=0.0;
	private Date dateOuvertureCompteEpargne = new Date();
	private String numeroCompteEpargne="XX-XXXX-CE";
	
	@OneToOne(mappedBy = "compteEpargne", cascade = CascadeType.ALL)
	private Client client;


	public CompteEpargne(double soldeCompteEpargne, Date dateOuvertureCompteEpargne, Client client) {
		super();
		this.soldeCompteEpargne = soldeCompteEpargne;
		this.dateOuvertureCompteEpargne = dateOuvertureCompteEpargne;
		this.client = client;
		this.numeroCompteEpargne = creationNumeroCompteEpargne(client, dateOuvertureCompteEpargne);
	}
	
	public CompteEpargne(double soldeCompteEpargne, Date dateOuvertureCompteEpargne) {
		super();
		this.soldeCompteEpargne = soldeCompteEpargne;
		this.dateOuvertureCompteEpargne = dateOuvertureCompteEpargne;
	}

	public CompteEpargne(double tauxRemuneration, double soldeCompteEpargne, Date dateOuvertureCompteEpargne) {
		super();
		this.tauxRemuneration = tauxRemuneration;
		this.soldeCompteEpargne = soldeCompteEpargne;
		this.dateOuvertureCompteEpargne = dateOuvertureCompteEpargne;
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
	
	public String creationNumeroCompteEpargne(Client client, Date dateOuvertureCompteEpargne) {
		Calendar cal = Calendar.getInstance();
	    cal.setTime(dateOuvertureCompteEpargne);
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
		String nouveauNumeroCompteEpargne = sb.toString();
		return nouveauNumeroCompteEpargne;
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
	
	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "CompteEpargne [idCompteEpargne=" + idCompteEpargne + ", tauxRemuneration=" + tauxRemuneration
				+ ", soldeCompteEpargne=" + soldeCompteEpargne + ", dateOuvertureCompteEpargne="
				+ dateOuvertureCompteEpargne + ", numeroCompteEpargne=" + numeroCompteEpargne + "]";
	}


	
		
	
	
}
