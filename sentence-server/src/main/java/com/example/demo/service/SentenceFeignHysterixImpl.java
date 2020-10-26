package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
@Qualifier("feignHystrixClient")
public class SentenceFeignHysterixImpl implements SentenceService {

	private final WordService wordService;
	
	
	
	public SentenceFeignHysterixImpl(WordService wordService) {
		super();
		this.wordService = wordService;
	}



	public String buildSentence() {
		
		System.out.println("From feign Hysterix client ==========================================");
		return  
			String.format("%s %s %s %s %s.",
				wordService.getSubject().getString(),
				wordService.getVerb().getString(),
				wordService.getArticle().getString(),
				wordService.getAdjective().getString(),
				wordService.getNoun().getString() )
			;
	}

}
