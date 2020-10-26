package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

  @Value("${lucky-word}") String luckyWord;
  
  @Value("${eureka.client.service-url.defaultZone}") String eurekaServer;

  @GetMapping("/lucky-word")
  public String showLuckyWord() {
    return "The lucky word is: " + luckyWord;
  }
  
  @GetMapping("/eurekaServer")
  public String showeurekaServer() {
    return "Eureka server is: " + eurekaServer;
  }
}
