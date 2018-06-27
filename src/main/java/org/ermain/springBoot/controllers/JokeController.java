package org.ermain.springBoot.controllers;

import org.ermain.springBoot.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

	private JokeService jokeService;
	
	@Autowired
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		
		// Retrieve a joke string and bind it the where 'joke' is within the template views
		model.addAttribute("joke", jokeService.getJoke());
		
		// Return the view name
		return "chucknorris";
	}
}
