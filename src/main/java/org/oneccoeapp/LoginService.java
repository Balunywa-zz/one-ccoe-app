package org.oneccoeapp;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean ValidateUser(String userid, String password) {
		return userid.equalsIgnoreCase("Lance") && password.equals("New");
	}

}
