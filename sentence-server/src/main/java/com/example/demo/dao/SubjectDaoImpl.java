package com.example.demo.dao;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;

@Component("subjectService")
public class SubjectDaoImpl extends WordDaoImpl {

	SubjectDaoImpl(LoadBalancerClient loadBalancer) {
		super(loadBalancer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPartOfSpeech() {
		// TODO Auto-generated method stub
		return SUBJECT;
	}

}
