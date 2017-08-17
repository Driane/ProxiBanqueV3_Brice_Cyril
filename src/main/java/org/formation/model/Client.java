package org.formation.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Brice Adelin/Cyril Rabineau
 *
 * Bean principale de Client avec ses variables, les getters/setters et une methode TO_String
 */

@Entity
@ManagedBean
@Table(name="client")
public class Client implements Serializable {
	

	private static final long serialVersionUID = -2524331431768668681L;

	/**
	 * Genere les variables de la classe Client
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idClient", nullable = false, unique = true)
	private int idClient;
	
	private String nom;
	private String prenom;
	
	private String email;
	private String adresse;
	private String codePostal;
	private String ville;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="comptecourant_client", unique=true)
	private CompteCourant compteCourant;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="compteepargne_client", unique=true)
	private CompteEpargne compteEpargne;
	

	public Client(String nom, String prenom) {
		super();
		this.nom = nom.trim().toUpperCase();
		this.prenom = prenom.trim().toLowerCase();
	}

	public Client(String nom, String prenom, String email, String adresse, String codePostal, String ville) {
		super();
		this.nom = nom.trim().toUpperCase();
		this.prenom = prenom.trim().toLowerCase();
		this.email = email;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public Client() {
		super();
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom.trim().toUpperCase();
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom.trim().toLowerCase();
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


	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}





	
	
}
