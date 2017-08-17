package org.formation.service;

import java.util.Date;

import org.formation.dao.ClientComptesDao;
import org.formation.dao.IClientComptesDao;
import org.formation.model.Client;
import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;

public class test {

	public static void main(String[] args) throws Exception {

		IClientComptesDao dao = new ClientComptesDao();
		

	
		Date date1 = new Date();
		
		Client client1 = new Client("LIONS", "Aurore", "aurore.LIONS@gmail.com", "1 Avenue Champs Elysee", "75000", "Paris");
		CompteCourant cc1 = new CompteCourant(3500.0, date1, client1);
		CompteEpargne ce1 = new CompteEpargne(1000.0, date1, client1);
		client1.setCompteCourant(cc1);
		client1.setCompteEpargne(ce1);

		Client client2 = new Client("DEGLAIRE", "Jean", "jean.DEGLAIRE@gmail.com", "12 Rue de Lourcine", "75005", "Paris");
		CompteCourant cc2 = new CompteCourant(-500.0, date1, client2);
		CompteEpargne ce2 = new CompteEpargne(200.0, date1, client2);
		client2.setCompteCourant(cc2);
		client2.setCompteEpargne(ce2);
		
		Client client3 = new Client("EL-CHORIZO", "Sebastien", "sebastien.ELCHORIZO@gmail.com", "33 Rue Tartempion", "78200", "Orleans");
		CompteCourant cc3 = new CompteCourant(1200.0, date1, client3);
		CompteEpargne ce3 = new CompteEpargne(3000.0, date1, client3);
		client3.setCompteCourant(cc3);
		client3.setCompteEpargne(ce3);
		
		dao.ajouterClientDao(client1);
		dao.ajouterClientDao(client2);
		dao.ajouterClientDao(client3);

	}

}
