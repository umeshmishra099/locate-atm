package com.locator.atm;

import com.locator.atm.entity.Address;
import com.locator.atm.entity.LocatorApiResponse;

import java.util.ArrayList;
import java.util.List;

public class TestUtil
{
  public static List<LocatorApiResponse> getExpectedResponse()
  {
    List<LocatorApiResponse> expectedControllerResponse = new ArrayList<>();
    LocatorApiResponse locatorApiResponse = new LocatorApiResponse();
    Address address = new Address();
    address.setCity("Rotterdam");
    address.setHousenumber("12/R");
    locatorApiResponse.setAddress(address);
    locatorApiResponse.setDistance(1);
    locatorApiResponse.setType("ING");
    expectedControllerResponse.add(locatorApiResponse);

    locatorApiResponse = new LocatorApiResponse();
    address = new Address();
    address.setCity("Amsterdam");
    address.setHousenumber("12/A");
    locatorApiResponse.setAddress(address);
    locatorApiResponse.setDistance(2);
    locatorApiResponse.setType("ING");
    expectedControllerResponse.add(locatorApiResponse);

    locatorApiResponse = new LocatorApiResponse();
    address = new Address();
    address.setCity("Amsterdam");
    address.setHousenumber("12/C");
    locatorApiResponse.setAddress(address);
    locatorApiResponse.setDistance(3);
    locatorApiResponse.setType("ING");
    expectedControllerResponse.add(locatorApiResponse);

    return expectedControllerResponse;
  }
}
