package com.example.demo.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.Word;

@FeignClient("ADJECTIVE")
public interface AdjectiveClient {
	@GetMapping("/")
	public Word getWord();
}
