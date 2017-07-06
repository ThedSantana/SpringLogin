package br.com.tiagoDeveloper.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	

	@RequestMapping(value="/login")
	public String login(@AuthenticationPrincipal User user){
		
		if(user != null){
			System.out.println(user.getUsername());
			
			return "redirect:/testeLogin/welcome";
		}
		
		return "livre/login";
	}


}
