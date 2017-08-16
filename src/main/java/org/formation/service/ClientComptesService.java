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
public class ClientComptesService implements Serializable {

	private static final long serialVersionUID = 2712370761732682577L;
	
	@Inject
	private IClientComptesDao clientComptesDao;
	
	public List<Client> listeInfosClients() throws Exception {
		List<Client> clients = clientComptesDao.listeInfosClientsDao();
		return clients;
	}
	
	public Client infoClient(int clientId) throws Exception {
		Client client = clientComptesDao.infoClientDao(clientId);
		return client;
	}
	
	public void ajouterClient(Client client) throws Exception {
		clientComptesDao.ajouterClientDao(client);
	}
	
	public void  miseAJourClient(Client client) throws Exception {
		clientComptesDao.miseAJourClientDao(client);
	}
	
	public void supprimerClient(int clientId) throws Exception {
		clientComptesDao.supprimerClientDao(clientId);
	}
	
	public List<CompteCourant> listeInfosCompteCourant() throws Exception {
		List<CompteCourant> comptesCourant = clientComptesDao.listeInfosCompteCourantDao();
		return comptesCourant;
	}
	
	public CompteCourant infoCompteCourant(int compteCourantId) throws Exception {
		CompteCourant compteCourant = clientComptesDao.infoCompteCourantDao(compteCourantId);
		return compteCourant;
	}
	
	public void miseAJourCompteCourant(CompteCourant compteCourant) throws Exception {
		clientComptesDao.miseAJourCompteCourantDao(compteCourant);
	}

	public List<CompteEpargne> listeInfosCompteEpargne() throws Exception {
		List<CompteEpargne> comptesEpargne = clientComptesDao.listeInfosCompteEpargneDao();
		return comptesEpargne;
	}
	
	public CompteEpargne infoCompteEpargne(int compteEpargneId) throws Exception {
		CompteEpargne compteEpargne = clientComptesDao.infoCompteEpargneDao(compteEpargneId);
		return compteEpargne;
	}
	
	public void miseAJourCompteEpargne(CompteEpargne compteEpargne) throws Exception {
		clientComptesDao.miseAJourCompteEpargneDao(compteEpargne);
	}
	
	public void Virement() {
		
	}
	

}
