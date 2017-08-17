package org.formation.vue;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PasswordView {
        
	private String password = "admin";
	private String login = "admin";
 
    public String getLogin() {
		return login;
	}

	public String getPassword() {
        return password;
    }
 
}