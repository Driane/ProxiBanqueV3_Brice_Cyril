package org.formation.service;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;

public interface IClientComptesService {

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#listeInfosClients()
	 */
	List<Client> listeInfosClients() throws Exception;

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#infoClient(int)
	 */
	Client infoClient(int clientId) throws Exception;

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#ajouterClient(org.formation.model.Client)
	 */
	void ajouterClient(Client client) throws Exception;

	void ajouterClientComptes(Client client, CompteCourant compteCourant, CompteEpargne compteEpargne) throws Exception;

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#miseAJourClient(org.formation.model.Client)
	 */
	void miseAJourClient(Client client) throws Exception;

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#supprimerClient(int)
	 */
	void supprimerClient(int clientId) throws Exception;

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#listeInfosCompteCourant()
	 */
	List<CompteCourant> listeInfosCompteCourant() throws Exception;

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#infoCompteCourant(int)
	 */
	CompteCourant infoCompteCourant(int compteCourantId) throws Exception;

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#miseAJourCompteCourant(org.formation.model.CompteCourant)
	 */
	void miseAJourCompteCourant(CompteCourant compteCourant) throws Exception;

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#listeInfosCompteEpargne()
	 */
	List<CompteEpargne> listeInfosCompteEpargne() throws Exception;

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#infoCompteEpargne(int)
	 */
	CompteEpargne infoCompteEpargne(int compteEpargneId) throws Exception;

	/* (non-Javadoc)
	 * @see org.formation.service.IClientComptesService#miseAJourCompteEpargne(org.formation.model.CompteEpargne)
	 */
	void miseAJourCompteEpargne(CompteEpargne compteEpargne) throws Exception;

}