package com.example.demo.dao;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;

import com.example.demo.domain.Word;

public abstract class WordDaoImpl implements WordDao {
	
	
	private final LoadBalancerClient loadBalancer;
	
	WordDaoImpl(LoadBalancerClient loadBalancer){
		this.loadBalancer = loadBalancer;
	}
	public abstract String getPartOfSpeech();
	@Override
	public Word getWord() {
		ServiceInstance instance = loadBalancer.choose(getPartOfSpeech());
   		return (new RestTemplate()).getForObject(instance.getUri(),Word.class);
	}

}
