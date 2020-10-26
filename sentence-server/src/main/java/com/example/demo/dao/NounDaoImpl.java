package com.example.demo.dao;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
@Component("nounService")
public class NounDaoImpl extends WordDaoImpl {

	NounDaoImpl(LoadBalancerClient loadBalancer) {
		super(loadBalancer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPartOfSpeech() {
		// TODO Auto-generated method stub
		return NOUN;
	}

}
