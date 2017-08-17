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

import org.formation.service.IClientComptesService;




@Named
@ApplicationScoped
public class Controlleur implements Serializable {

	private static final long serialVersionUID = 3905775693788042119L;

	@Inject
	private IClientComptesService clientComptesService;
	
	private static Logger LOGGER = LoggerFactory.getLogger(Controlleur.class);

	public Controlleur() throws Exception {
		super();
	}

	
	
	
}
