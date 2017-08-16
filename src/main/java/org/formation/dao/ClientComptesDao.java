package org.formation.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.formation.model.Client;
import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;

public class ClientComptesDao implements Serializable {


	private static final long serialVersionUID = 1L;

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	
	public List<Client> listeInfosClients() throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		List<Client> reList = new ArrayList<Client>();
		try {
			txn.begin();
			String sql = "from client";
			TypedQuery<Client> query = em.createQuery(sql, Client.class);
			reList = query.getResultList();
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return reList;
	}
	
	public Client infoClient(int clientId) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		Client client = new Client();
		try {
			txn.begin();
			client = em.find(Client.class, clientId);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return client;
	}
	
	public void ajouterClient(Client client) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.persist(client);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}
	
	public void miseAJourClient(Client client) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.merge(client);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
	
	public void supprimerClient(int clientId) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			Client client = em.find(Client.class, clientId);
			em.remove(client);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
	
	public List<CompteCourant> listeInfosCompteCourant() throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		List<CompteCourant> reList = new ArrayList<CompteCourant>();
		try {
			txn.begin();
			String sql = "from compte_courant";
			TypedQuery<CompteCourant> query = em.createQuery(sql, CompteCourant.class);
			reList = query.getResultList();
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return reList;
	}
	
	public CompteCourant infoCompteCourant (int compteCourantId) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		CompteCourant compteCourant = new CompteCourant();
		try {
			txn.begin();
			compteCourant = em.find(CompteCourant.class, compteCourantId);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return compteCourant;
	}
	
	public void miseAJourCompteCourant(CompteCourant compteCourant) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.merge(compteCourant);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
	
	public List<CompteEpargne> listeInfosCompteEpargne() throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		List<CompteEpargne> reList = new ArrayList<CompteEpargne>();
		try {
			txn.begin();
			String sql = "from compte_epargne";
			TypedQuery<CompteEpargne> query = em.createQuery(sql, CompteEpargne.class);
			reList = query.getResultList();
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return reList;
	}
	
	public CompteEpargne infoCompteEpargne (int compteEpargneId) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		CompteEpargne compteEpargne = new CompteEpargne();
		try {
			txn.begin();
			compteEpargne = em.find(CompteEpargne.class, compteEpargneId);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return compteEpargne;
	}
	
	public void miseAJourCompteEpargne(CompteEpargne compteEpargne) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.merge(compteEpargne);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
	
	
	
}
