package org.formation.vue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import org.formation.model.Client;
import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;
import org.formation.service.IClientComptesService;

@Named
@ApplicationScoped
public class Controlleur implements Serializable {

	private static final long serialVersionUID = 3905775693788042119L;

	@Inject
	private IClientComptesService clientComptesService;

	private List<Client> clients;
	private List<CompteCourant> compteCourantClients;
	private List<CompteEpargne> compteEpargneClients;
	private static Logger LOGGER = LoggerFactory.getLogger(Controlleur.class);

//	public Controlleur() throws Exception {
//		super();
//		clients = new ArrayList<>();
//		compteCourantClients = new ArrayList<>();
//		compteEpargneClients = new ArrayList<>();
//	}
	
	public List<Client> getClients() {
		loadClients();
		return clients;
	}
	
	public List<CompteCourant> getCompteCourantClients() {
		return compteCourantClients;
	}
	
	public List<CompteEpargne> getCompteEpargneClients() {
		return compteEpargneClients;
	}

	public void loadClients() {

		LOGGER.debug("Lister les clients");
		LOGGER.info("Information lister les clients");


		try {

			// get all students from database
			clients = clientComptesService.listeInfosClients();
			System.out.println(clients.get(0));

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur pour liste des clients", exc);

			// add error message for JSF page
			addErrorMessage(exc);
		}
	}

	public String ajoutClient(Client client, CompteCourant compteCourant, CompteEpargne compteEpargne) {
		LOGGER.info("Ajout client + compte courant + compte epargne : " + client + " - " + compteCourant + " - "
				+ compteEpargne);

		try {

			// add student to the database
			clientComptesService.ajouterClientComptes(client, compteCourant, compteEpargne);

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur ajout client et comptes", exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		// return "list-students?faces-redirect=true";
		return "????????????????????????????";
	}


	public String buttonAction() {
		return "accueil";
	}

	public String detailClient(int clientId) {

		LOGGER.info("Infos client : " + clientId);

		try {
			// get student from database
			Client client = clientComptesService.infoClient(clientId);

			// put in the request attribute ... so we can use it on the form
			// page
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();

			Map<String, Object> requestMap = externalContext.getRequestMap();
			requestMap.put("Client", client);

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur lors infos client id :" + clientId, exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		// return "update-student-form.xhtml";
		return "???????????????????????";
	}

	public String miseAJourInfosClient(Client client) {

		LOGGER.info("Mise à jour infos client : " + client);

		try {

			// update student in the database
			clientComptesService.miseAJourClient(client);

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur lors de la mise à jour du client : " + client, exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		// return "list-students?faces-redirect=true";
		return "????????????????????????";
	}

	public String suppressionClient(int clientId) {

		LOGGER.info("Suppression du client id : " + clientId);

		try {

			// delete the student from the database
			clientComptesService.supprimerClient(clientId);

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur lors de la suppression du client id : " + clientId, exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		// return "list-students";
		return "???????????????????";
	}

	public void listeCompteCourantClients() {

		LOGGER.debug("Lister tous les comptes courant");
		LOGGER.info("Information tous les comptes courant");

		compteCourantClients.clear();

		try {

			// get all students from database
			compteCourantClients = clientComptesService.listeInfosCompteCourant();

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur pour lister tous les comptes courant", exc);

			// add error message for JSF page
			addErrorMessage(exc);
		}
	}

	public String detailCompteCourantClient(int compteCourantId) {

		LOGGER.info("Infos compte courant client : " + compteCourantId);

		try {
			// get student from database
			CompteCourant cc = clientComptesService.infoCompteCourant(compteCourantId);

			// put in the request attribute ... so we can use it on the form
			// page
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();

			Map<String, Object> requestMap = externalContext.getRequestMap();
			requestMap.put("Compte courant", cc);

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur lors infos compte courant client : " + compteCourantId, exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		// return "update-student-form.xhtml";
		return "???????????????????????";
	}
	
	public String gotoClient() {
		return "addClient";
	}
	
	public String gotoListClient() {
		return "listeClient";
	}
	public String miseAJourInfosCC(CompteCourant compteCourant) {

		LOGGER.info("Mise à jour infos compte courant : " + compteCourant);

		try {

			// update student in the database
			clientComptesService.miseAJourCompteCourant(compteCourant);

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur lors de la mise à jour infos compte courant : " + compteCourant, exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		// return "list-students?faces-redirect=true";
		return "????????????????????????";
	}
	
	public void listeCompteEpargneClients() {

		LOGGER.debug("Lister tous les comptes epargne");
		LOGGER.info("Information tous les comptes epargne");

		compteEpargneClients.clear();

		try {

			// get all students from database
			compteEpargneClients = clientComptesService.listeInfosCompteEpargne();

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur pour lister tous les comptes epargne", exc);

			// add error message for JSF page
			addErrorMessage(exc);
		}
	}

	public String detailCompteEpargneClient(int compteEpargneId) {

		LOGGER.info("Infos compte epargne client : " + compteEpargneId);

		try {
			// get student from database
			CompteEpargne ce = clientComptesService.infoCompteEpargne(compteEpargneId);

			// put in the request attribute ... so we can use it on the form
			// page
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();

			Map<String, Object> requestMap = externalContext.getRequestMap();
			requestMap.put("Compte epargne", ce);

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur lors infos compte epargne client : " + compteEpargneId, exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		// return "update-student-form.xhtml";
		return "???????????????????????";
	}
	
	
	public String miseAJourInfosCE(CompteEpargne compteEpargne) {

		LOGGER.info("Mise à jour infos compte epargne : " + compteEpargne);

		try {

			// update student in the database
			clientComptesService.miseAJourCompteEpargne(compteEpargne);

		} catch (Exception exc) {
			// send this to server logs
			LOGGER.error("Erreur lors de la mise à jour infos compte epargne : " + compteEpargne, exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		// return "list-students?faces-redirect=true";
		return "????????????????????????";
	}

	
	
	
	private void addErrorMessage(Exception exc) {
		FacesMessage message = new FacesMessage("Erreur : " + exc.getMessage());
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String logOut() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		externalContext.invalidateSession();
		return "?????????";
	}

}
