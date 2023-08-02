package com.in28min.rest.webservices.restfulwebservices;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private MessageSource messagesource; 
	
	public HelloWorldController(MessageSource messagesource){
		this.messagesource=messagesource;
	}
	
	@GetMapping("/hello-world-internationalization")
	public String internationalization() {
		
		Locale locale=LocaleContextHolder.getLocale();
		return messagesource.getMessage("local.language.message", null, "Default Message", locale);
	}
}
