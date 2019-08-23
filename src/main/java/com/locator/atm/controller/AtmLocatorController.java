package com.locator.atm.controller;

import com.locator.atm.entity.LocatorApiResponse;
import com.locator.atm.service.AtmLocatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AtmLocatorController
{
  private final AtmLocatorService atmLocatorService;

  @Autowired
  public AtmLocatorController(AtmLocatorService atmLocatorService)
  {
    this.atmLocatorService = atmLocatorService;
  }

  @RequestMapping("/hello")
  public String hello()
  {
    return "Hello";
  }

  @RequestMapping(value = "/atmLocations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<LocatorApiResponse> getINGATMLocation() throws Exception
  {
    return atmLocatorService.getINGATMLocation();
  }

  @RequestMapping(value = "/atmLocations/{city}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<LocatorApiResponse> getINGATMLocationByCity(@PathVariable("city") String city) throws Exception
  {
    return atmLocatorService.getINGATMLocationByCity(city);
  }
}
