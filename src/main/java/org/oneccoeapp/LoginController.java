package org.oneccoeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
    @RequestMapping(value="/login", method = RequestMethod.GET)
	public String ShowLoginPage(ModelMap model) { 
    	//model.put ("name", name );
    	return "login";
		
	}
    
    
  /*  @RequestMapping(value="/login")
 	public String ShowJoinPage(ModelMap model, @RequestParam String name, @RequestParam String password) { 
     	boolean isValidUser = service.ValidateUser(name, password);
    	
     	if(!isValidUser) {
     		model.put("message", "invalid credentials");
     		return "join";
     		
     	}
    	
    	model.put("name", name);
    	model.put("password", password);
    	
     	return "welcome";
 		
 	}
  */
    
    @RequestMapping(value="/login", method = RequestMethod.POST)
 	public String ShowWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) { 
     	boolean isValidUser = service.ValidateUser(name, password);
    	
     	if(!isValidUser) {
     		model.put("errorMessage", "invalid credentials");
     		return "login";
     		
     	}
    	
    	model.put("name", name);
    	model.put("password", password);
    	
     	return "welcome";
 		
 	}
}
