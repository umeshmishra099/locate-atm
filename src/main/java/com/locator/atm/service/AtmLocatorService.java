package com.locator.atm.service;

import com.locator.atm.dao.AtmLocatorData;
import com.locator.atm.entity.LocatorApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class AtmLocatorService
{

  private final AtmLocatorData atmLocatorData;

  @Autowired
  public AtmLocatorService(AtmLocatorData atmLocatorData)
  {
    this.atmLocatorData = atmLocatorData;
  }

  public List<LocatorApiResponse> getINGATMLocation() throws Exception
  {
    return atmLocatorData.getINGData();
  }

  public List<LocatorApiResponse> getINGATMLocationByCity(String city) throws Exception
  {
    return atmLocatorData.getINGData().stream().filter(response -> response.getAddress().getCity().equalsIgnoreCase(city)).collect(toList());
  }

}
