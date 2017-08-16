package org.formation.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.formation.model.Personne;


@Entity
@ManagedBean
@Table(name="client")
public class Client extends Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idClient;
	
	private String email;
	private String adresse;
	private String codePostal;
	private String ville;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="comptecourant_client")
	private CompteCourant compteCourant;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="compteepargne_client")
	private CompteEpargne compteEpargne;
	
	public Client(String nom, String prenom) {
		super(nom, prenom);
	}

	public Client(String nom, String prenom, String email, String adresse, String codePostal, String ville) {
		super(nom, prenom);
		this.email = email;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	@Override
	public String toString() {
		return "Client [email=" + email + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville
				+ ", idClient=" + idClient + "]";
	}



	
	
}
