package com.example.demo.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.Word;

@FeignClient("ARTICLE")
public interface ArticleClient {
	@GetMapping("/")
	public Word getWord();

}
