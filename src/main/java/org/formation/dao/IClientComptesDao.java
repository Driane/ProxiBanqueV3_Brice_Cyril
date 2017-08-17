package org.formation.dao;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;
/**
 * 
 * @author Brice Adelin/Cyril Rabineau
 * 
 * Interface de ClientComptesDAO
 *
 */
public interface IClientComptesDao {

	List<Client> listeInfosClientsDao() throws Exception;

	Client infoClientDao(int clientId) throws Exception;

	void ajouterClientDao(Client client) throws Exception;

	void miseAJourClientDao(Client client) throws Exception;

	void supprimerClientDao(int clientId) throws Exception;

	List<CompteCourant> listeInfosCompteCourantDao() throws Exception;

	CompteCourant infoCompteCourantDao(int compteCourantId) throws Exception;

	void miseAJourCompteCourantDao(CompteCourant compteCourant) throws Exception;

	List<CompteEpargne> listeInfosCompteEpargneDao() throws Exception;

	CompteEpargne infoCompteEpargneDao(int compteEpargneId) throws Exception;

	void miseAJourCompteEpargneDao(CompteEpargne compteEpargne) throws Exception;

}