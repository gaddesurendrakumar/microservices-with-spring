package com.example.demo.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.Word;

@FeignClient("SUBJECT")
public interface SubjectClient {

	@GetMapping("/")
	public Word getWord();
	
}

