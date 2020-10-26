package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.feign.client.AdjectiveClient;
import com.example.demo.feign.client.ArticleClient;
import com.example.demo.feign.client.NounClient;
import com.example.demo.feign.client.SubjectClient;
import com.example.demo.feign.client.VerbClient;
@Service
@Qualifier("feignClient")
public class SentenceServiceFeignImpl  implements SentenceService{

	
	private final VerbClient verbService;
	private final SubjectClient subjectService;
	private final ArticleClient articleService;
	private final AdjectiveClient adjectiveService;
	private final NounClient nounService;
	
	
	public SentenceServiceFeignImpl(VerbClient verbService, SubjectClient subjectService, ArticleClient articleService,
			AdjectiveClient adjectiveService, NounClient nounService) {
		super();
		this.verbService = verbService;
		this.subjectService = subjectService;
		this.articleService = articleService;
		this.adjectiveService = adjectiveService;
		this.nounService = nounService;
	}


	@Override
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		System.out.println("Sentence from Feign client **********************************************************");
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
