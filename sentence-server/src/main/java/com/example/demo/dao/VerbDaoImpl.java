package com.example.demo.dao;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;

@Component("verbService")
public class VerbDaoImpl extends WordDaoImpl {

	VerbDaoImpl(LoadBalancerClient loadBalancer) {
		super(loadBalancer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPartOfSpeech() {
		// TODO Auto-generated method stub
		return VERB;
	}

}
