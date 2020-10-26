package com.example.demo.dao;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;

@Component("articleService")
public class ArticleDaoImpl extends WordDaoImpl {

	ArticleDaoImpl(LoadBalancerClient loadBalancer) {
		super(loadBalancer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPartOfSpeech() {
		// TODO Auto-generated method stub
		return ARTICLE;
	}

}
