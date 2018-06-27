package org.ermain.springBoot.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	@Override
	public String getJoke() {
		// TODO Implement Service 
		return chuckNorrisQuotes.getRandomQuote();
	}

}
