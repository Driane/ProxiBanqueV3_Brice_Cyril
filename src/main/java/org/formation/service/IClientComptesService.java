package org.formation.service;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;

public interface IClientComptesService {

	List<Client> listeInfosClients() throws Exception;

	Client infoClient(int clientId) throws Exception;

	void ajouterClient(Client client) throws Exception;

	void miseAJourClient(Client client) throws Exception;

	void supprimerClient(int clientId) throws Exception;

	List<CompteCourant> listeInfosCompteCourant() throws Exception;

	CompteCourant infoCompteCourant(int compteCourantId) throws Exception;

	void miseAJourCompteCourant(CompteCourant compteCourant) throws Exception;

	List<CompteEpargne> listeInfosCompteEpargne() throws Exception;

	CompteEpargne infoCompteEpargne(int compteEpargneId) throws Exception;

	void miseAJourCompteEpargne(CompteEpargne compteEpargne) throws Exception;

}