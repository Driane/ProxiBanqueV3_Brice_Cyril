package org.formation.vue;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.formation.service.IClientComptesService;




@Named
@ApplicationScoped
public class Controlleur implements Serializable {

	private static final long serialVersionUID = 3905775693788042119L;

	@Inject
	private IClientComptesService clientComptesService;

	
}
