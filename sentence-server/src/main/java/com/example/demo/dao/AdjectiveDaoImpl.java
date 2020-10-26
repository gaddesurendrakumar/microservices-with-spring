package com.example.demo.dao;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
@Component("adjectiveService")
public class AdjectiveDaoImpl extends WordDaoImpl {

	AdjectiveDaoImpl(LoadBalancerClient loadBalancer) {
		super(loadBalancer);
	}

	@Override
	public String getPartOfSpeech() {
		// TODO Auto-generated method stub
		return ADJECTIVE;
	}

}
