package org.formation.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.formation.model.Client;

public class ClientComptesDao implements Serializable {


	private static final long serialVersionUID = 1L;

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	
	public List<Client> listeClients() throws Exception {
		
	}
	
}
