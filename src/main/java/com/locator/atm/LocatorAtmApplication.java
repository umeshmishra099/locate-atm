package com.locator.atm;

import com.locator.atm.dao.AtmLocatorData;
import com.locator.atm.dao.AtmLocatorDataImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LocatorAtmApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(LocatorAtmApplication.class, args);
  }

  @Bean
  public AtmLocatorData atmLocatorData()
  {
    return new AtmLocatorDataImpl();
  }

  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder builder)
  {
    return builder.build();
  }

}
