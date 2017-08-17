package org.formation.vue;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
 /**
  * 
  * @author Brice Adelin / Cyril Rabineau	
  *
  */
@ManagedBean
@ViewScoped
public class InputNumberView {
 

    private Double montant = new Double(0);

 
 
    public InputNumberView() {

        montant = 0d;
 
    }
    
    public void buttonAction(ActionEvent actionEvent) {
        
    }


	public Double getMontant() {
		return montant;
	}



	public void setMontant(Double montant) {
		this.montant = montant;
	}
}