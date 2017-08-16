package org.formation.service;

import java.util.Date;

import org.formation.dao.ClientComptesDao;
import org.formation.model.Client;
import org.formation.model.CompteCourant;

public class test {

	public static void main(String[] args) throws Exception {

		ClientComptesDao dao = new ClientComptesDao();
		
		Client client1 = new Client("BOB", "toto", "bob@gmail.com", "1RueTartempion", "31000", "Toulouse");

		double solde = 1000.0;
		Date date = new Date();
		String numCC = "client1-CC";
		CompteCourant cc = new CompteCourant(solde, date, numCC);
		client1.setCompteCourant(cc);		
		dao.ajouterClient(client1);

	}

}
