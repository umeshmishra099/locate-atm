package com.locator.atm.entity;

public class LocatorApiResponse
{
  private Address address;
  private int distance;
  private String type;

  public Address getAddress()
  {
    return this.address;
  }

  public void setAddress(Address address)
  {
    this.address = address;
  }

  public int getDistance()
  {
    return this.distance;
  }

  public void setDistance(int distance)
  {
    this.distance = distance;
  }

  public String getType()
  {
    return this.type;
  }

  public void setType(String type)
  {
    this.type = type;
  }
}
