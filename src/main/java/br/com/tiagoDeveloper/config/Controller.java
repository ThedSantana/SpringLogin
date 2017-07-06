package br.com.tiagoDeveloper.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Controller extends WebMvcConfigurerAdapter{
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addRedirectViewController("/", "/testeLogin/welcome");
		registry.addRedirectViewController("/testeLogin/", "/testeLogin/welcome");
		registry.addRedirectViewController("/testeLogin", "/testeLogin/welcome");
	}
	
}
