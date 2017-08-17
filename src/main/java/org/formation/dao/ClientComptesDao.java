package org.formation.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.formation.model.Client;
import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;

/**
 * 
 * @author Brice Adelin/Cyril Rabineau
 *
 *Ceci est la dao utilisée pour client et comptes
 */
@Named
@ApplicationScoped
public class ClientComptesDao implements Serializable, IClientComptesDao {


	private static final long serialVersionUID = 1L;

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	
	/**
	 *  Méthode de listing des infos du client
	 */
	@Override
	public List<Client> listeInfosClientsDao() throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		List<Client> reList = new ArrayList<Client>();
		try {
			txn.begin();
			String sql = "from Client";
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
	
	/**
	 * Methode de récupération des infos du client 
	 */
	@Override
	public Client infoClientDao(int clientId) throws Exception {
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
	
	/**
	 * Methode permettant d'ajouter un client
	 */
	@Override
	public void ajouterClientDao(Client client) throws Exception {
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
	
	/**
	 * Méthode permettant al mise à jour des infos d'un client
	 */
	@Override
	public void miseAJourClientDao(Client client) throws Exception {
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
	
	/**
	 * Methode permettant de supprimer un client
	 */
	@Override
	public void supprimerClientDao(int clientId) throws Exception {
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
	
	/**
	 * Listing des infos des comptes courants
	 */
	@Override
	public List<CompteCourant> listeInfosCompteCourantDao() throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		List<CompteCourant> reList = new ArrayList<CompteCourant>();
		try {
			txn.begin();
			String sql = "from CompteCourant";
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
	
	/**
	 * Methode de récupération des infos des comptes courant
	 */
	@Override
	public CompteCourant infoCompteCourantDao (int compteCourantId) throws Exception {
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
	
	/**
	 * Methode de mise a jour des comptes courant
	 */
	@Override
	public void miseAJourCompteCourantDao(CompteCourant compteCourant) throws Exception {
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
	
	/**
	 * Listing des infos des comptes épargne
	 */
	@Override
	public List<CompteEpargne> listeInfosCompteEpargneDao() throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		List<CompteEpargne> reList = new ArrayList<CompteEpargne>();
		try {
			txn.begin();
			String sql = "from CompteEpargne";
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
	
	/**
	 * Methode de réupération des infos des comptes épargne
	 */
	@Override
	public CompteEpargne infoCompteEpargneDao (int compteEpargneId) throws Exception {
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
	
	/**
	 * Methode de mise a jour des comptes epargnes
	 */
	@Override
	public void miseAJourCompteEpargneDao(CompteEpargne compteEpargne) throws Exception {
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
