package org.formation.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.formation.dao.IClientComptesDao;
import org.formation.model.Client;
import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;

@Named
@ApplicationScoped
public class ClientComptesService implements Serializable, IClientComptesService {

	private static final long serialVersionUID = 2712370761732682577L;
	
	@Inject
	private IClientComptesDao clientComptesDao;
	
	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#listeInfosClients()
	 */
	@Override
	public List<Client> listeInfosClients() throws Exception {
		List<Client> clients = clientComptesDao.listeInfosClientsDao();
		return clients;
	}
	
	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#infoClient(int)
	 */
	@Override
	public Client infoClient(int clientId) throws Exception {
		Client client = clientComptesDao.infoClientDao(clientId);
		return client;
	}
	
	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#ajouterClient(org.formation.model.Client)
	 */
	@Override
	public void ajouterClient(Client client) throws Exception {
		clientComptesDao.ajouterClientDao(client);
	}
	

	@Override
	public void ajouterClientComptes(Client client, CompteCourant compteCourant, CompteEpargne compteEpargne) throws Exception {
		client.setCompteCourant(compteCourant);
		client.setCompteEpargne(compteEpargne);
		clientComptesDao.ajouterClientDao(client);
	}

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#miseAJourClient(org.formation.model.Client)
	 */
	@Override
	public void  miseAJourClient(Client client) throws Exception {
		clientComptesDao.miseAJourClientDao(client);
	}
	
	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#supprimerClient(int)
	 */
	@Override
	public void supprimerClient(int clientId) throws Exception {
		clientComptesDao.supprimerClientDao(clientId);
	}
	
	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#listeInfosCompteCourant()
	 */
	@Override
	public List<CompteCourant> listeInfosCompteCourant() throws Exception {
		List<CompteCourant> comptesCourant = clientComptesDao.listeInfosCompteCourantDao();
		return comptesCourant;
	}
	
	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#infoCompteCourant(int)
	 */
	@Override
	public CompteCourant infoCompteCourant(int compteCourantId) throws Exception {
		CompteCourant compteCourant = clientComptesDao.infoCompteCourantDao(compteCourantId);
		return compteCourant;
	}
	
	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#miseAJourCompteCourant(org.formation.model.CompteCourant)
	 */
	@Override
	public void miseAJourCompteCourant(CompteCourant compteCourant) throws Exception {
		clientComptesDao.miseAJourCompteCourantDao(compteCourant);
	}

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#listeInfosCompteEpargne()
	 */
	@Override
	public List<CompteEpargne> listeInfosCompteEpargne() throws Exception {
		List<CompteEpargne> comptesEpargne = clientComptesDao.listeInfosCompteEpargneDao();
		return comptesEpargne;
	}
	
	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#infoCompteEpargne(int)
	 */
	@Override
	public CompteEpargne infoCompteEpargne(int compteEpargneId) throws Exception {
		CompteEpargne compteEpargne = clientComptesDao.infoCompteEpargneDao(compteEpargneId);
		return compteEpargne;
	}
	
	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#miseAJourCompteEpargne(org.formation.model.CompteEpargne)
	 */
	@Override
	public void miseAJourCompteEpargne(CompteEpargne compteEpargne) throws Exception {
		clientComptesDao.miseAJourCompteEpargneDao(compteEpargne);
	}

	

}
