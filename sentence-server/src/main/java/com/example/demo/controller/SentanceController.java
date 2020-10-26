package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.domain.Word;
import com.example.demo.service.SentenceService;
@RestController
public class SentanceController {
	private final SentenceService sentenceService;
		
		public SentanceController(SentenceService sentenceService) {
		super();
		this.sentenceService = sentenceService;
	}

		@GetMapping("/sentence")
		  public @ResponseBody String getSentence() {
			return 
					"<h3>Some Sentences</h3><br/>" +	  
					sentenceService.buildSentence() + "<br/><br/>" +
					sentenceService.buildSentence() + "<br/><br/>" +
					sentenceService.buildSentence() + "<br/><br/>" +
					sentenceService.buildSentence() + "<br/><br/>" +
					sentenceService.buildSentence() + "<br/><br/>";
		  }
		  
		  
}
