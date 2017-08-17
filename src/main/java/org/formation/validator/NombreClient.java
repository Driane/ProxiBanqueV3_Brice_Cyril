package org.formation.validator;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;

import org.formation.service.IClientComptesService;


@FacesValidator("nombreClient")
public class NombreClient implements Validator {

	@Inject
	private IClientComptesService clientComptesService;
	
	
	public NombreClient() {
		super();
	}



	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {
		int nombreClient=10;
		try {
			nombreClient = clientComptesService.listeInfosClients().size();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(nombreClient >= 10){

			FacesMessage msg =
				new FacesMessage("Quota de client atteint !!!! Vous ne pouvez pas avoir plus de 10 clients !!!!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);

		}

	}
}