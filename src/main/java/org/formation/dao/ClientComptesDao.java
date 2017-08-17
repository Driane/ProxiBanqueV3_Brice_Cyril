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

@Named
@ApplicationScoped
public class ClientComptesDao implements Serializable, IClientComptesDao {


	private static final long serialVersionUID = 1L;

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#listeInfosClients()
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
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#infoClient(int)
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
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#ajouterClient(org.formation.model.Client)
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
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#miseAJourClient(org.formation.model.Client)
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
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#supprimerClient(int)
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
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#listeInfosCompteCourant()
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
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#infoCompteCourant(int)
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
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#miseAJourCompteCourant(org.formation.model.CompteCourant)
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
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#listeInfosCompteEpargne()
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
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#infoCompteEpargne(int)
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
	
	/* (non-Javadoc)
	 * @see org.formation.dao.IClientComptesDao#miseAJourCompteEpargne(org.formation.model.CompteEpargne)
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
