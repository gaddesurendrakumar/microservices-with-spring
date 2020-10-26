package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Word;
import com.example.demo.feign.client.AdjectiveClient;
import com.example.demo.feign.client.ArticleClient;
import com.example.demo.feign.client.NounClient;
import com.example.demo.feign.client.SubjectClient;
import com.example.demo.feign.client.VerbClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class WordServiceImpl implements WordService {
	
	
	private final VerbClient verbClient;
	private final SubjectClient subjectClient;
	private final ArticleClient articleClient;
	private final AdjectiveClient adjectiveClient;
	private final NounClient nounClient;
	
	

	public WordServiceImpl(VerbClient verbClient, SubjectClient subjectClient, ArticleClient articleClient,
			AdjectiveClient adjectiveClient, NounClient nounClient) {
		super();
		this.verbClient = verbClient;
		this.subjectClient = subjectClient;
		this.articleClient = articleClient;
		this.adjectiveClient = adjectiveClient;
		this.nounClient = nounClient;
	}

	@Override
	@HystrixCommand(fallbackMethod="getFallbackSubject")
	public Word getSubject() {
		return subjectClient.getWord();
	}
	
	@Override
	public Word getVerb() {
		return verbClient.getWord();
	}
	
	@Override
	public Word getArticle() {
		return articleClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackNoun")
	public Word getNoun() {
		return nounClient.getWord();
	}	

	public Word getFallbackSubject() {
		return new Word("Someone");
	}
	
	public Word getFallbackAdjective() {
		return new Word("");
	}
	
	public Word getFallbackNoun() {
		return new Word("something");
	}

}
