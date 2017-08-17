package org.formation.vue;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.formation.model.Client;
import org.primefaces.event.FlowEvent;
 /**
  * 
  * @author Brice Adelin / Cyril Rabineau
  *
  */
@ManagedBean
@ViewScoped
public class UserWizard implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Client user = new Client();
     

     
    public Client getUser() {
        return user;
    }
 
    public void setUser(Client user) {
        this.user = user;
    }
     
    public void save() {        
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + user.getNom());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public String onFlowProcess(FlowEvent event) {

            return event.getNewStep();
      
    }
}