package org.formation.vue;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PasswordView {
        
	private String password = "admin";  
 
    public String getPassword() {
        return password;
    }
 
}