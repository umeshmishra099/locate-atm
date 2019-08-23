package com.locator.atm.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.locator.atm.entity.LocatorApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AtmLocatorDataImpl implements AtmLocatorData
{

  private static final String URL = "https://www.ing.nl/api/locator/atms/";

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public List<LocatorApiResponse> getINGData() throws IOException
  {
    String response = restTemplate.getForObject(URL, String.class);
    String ToParsedResponse = response.substring(6, response.length());
    ObjectMapper objectMapper = new ObjectMapper();
    LocatorApiResponse[] ingAtmLocations = objectMapper.readValue(ToParsedResponse, LocatorApiResponse[].class);
    return Arrays.asList(ingAtmLocations);
  }
}
