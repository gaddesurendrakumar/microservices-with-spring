package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dao.WordDao;
@Service
public class SentenceServiceImpl implements SentenceService {
	
	
	private final WordDao verbService;
	private final WordDao subjectService;
	private final WordDao articleService;
	private final  WordDao adjectiveService;
	private final  WordDao nounService;
	
	

	public SentenceServiceImpl(WordDao verbService, WordDao subjectService, WordDao articleService,
			WordDao adjectiveService, WordDao nounService) {
		super();
		this.verbService = verbService;
		this.subjectService = subjectService;
		this.articleService = articleService;
		this.adjectiveService = adjectiveService;
		this.nounService = nounService;
	}



	@Override
	public String buildSentence() {
		// TODO Auto-generated method stub
		String sentence = "There was a problem assembling the sentence!";
		sentence =  
			String.format("%s %s %s %s %s.",
				subjectService.getWord().getString(),
				verbService.getWord().getString(),
				articleService.getWord().getString(),
				adjectiveService.getWord().getString(),
				nounService.getWord().getString() );
		return sentence;
	}

}
