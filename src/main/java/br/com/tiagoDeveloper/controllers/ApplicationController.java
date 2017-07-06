package br.com.tiagoDeveloper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import br.com.tiagoDeveloper.models.User;
import br.com.tiagoDeveloper.models.Usuario;
import br.com.tiagoDeveloper.repositorys.RoleRepository;
import br.com.tiagoDeveloper.repositorys.UserRepository;
import br.com.tiagoDeveloper.services.UserServiceImpl;

@Controller
@RequestMapping("/testeLogin")
public class ApplicationController {
	
	@Autowired
	private UserServiceImpl addUser;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/welcome")
	public String welcome(){
		return "livre/welcome";
	}

	@RequestMapping("/listaUser")
	public ModelAndView listaUser(){
		ModelAndView mv = new ModelAndView("seguro/pesqUsuario");
		mv.addObject("users", userRepository.findAll());
		return mv;
	}
	
	@RequestMapping("/home")
	public String home(){
		return "seguro/home";
	}	
	
	@RequestMapping(value="/cadUsuario", method = RequestMethod.GET)
	public ModelAndView novoUsuario( @AuthenticationPrincipal org.springframework.security.core.userdetails.User logado){
		ModelAndView mv = new ModelAndView("seguro/cadUsuario");
		User user = userRepository.findByUsername(logado.getUsername());
		
		mv.addObject(user);
		return mv;
	}
	@RequestMapping(value="/cadUsuario", method = RequestMethod.POST)
	public String salvaUsuario(User user, @AuthenticationPrincipal org.springframework.security.core.userdetails.User logado){
		User user1 = userRepository.findByUsername(logado.getUsername());
		user1.setBairro(user.getBairro());
		user1.setCel(user.getCel());
		user1.setNome(user.getNome());
		user1.setCep(user.getCep());
		user1.setNum(user.getNum());
		user1.setCpf(user.getCpf());
		user1.setEmail(user.getEmail());
		user1.setCid(user.getCid());
		user1.setTel(user.getTel());
		user1.setRua(user.getRua());
		user1.setCompl(user.getCompl());
		user1.setDataNasc(user.getDataNasc());
		user1.setUf(user.getUf());
		userRepository.save(user1);
		
		return "redirect:/testeLogin/cadUsuario";
	}
	

	@RequestMapping(value="/cadConta", method = RequestMethod.GET)
	public ModelAndView novaConta(User user){
		ModelAndView mv = new ModelAndView("seguro/cadConta");
		mv.addObject("roles", roleRepo.findAll());
		return mv;
	}
	@RequestMapping(value="/cadConta", method = RequestMethod.POST)
	public String salvarConta(User user){
		
		addUser.save(user);
		return "redirect:/testeLogin/cadConta";
	}
	
	
	

}
