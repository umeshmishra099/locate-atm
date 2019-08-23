package com.locator.atm.entity;

public class Address
{
  private String street;
  private String housenumber;
  private String postalcode;
  private String city;
  private GeoLocation geoLocation;

  public String getStreet()
  {
    return this.street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getHousenumber()
  {
    return this.housenumber;
  }

  public void setHousenumber(String housenumber)
  {
    this.housenumber = housenumber;
  }

  public String getPostalcode()
  {
    return this.postalcode;
  }

  public void setPostalcode(String postalcode)
  {
    this.postalcode = postalcode;
  }

  public String getCity()
  {
    return this.city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public GeoLocation getGeoLocation()
  {
    return this.geoLocation;
  }

  public void setGeoLocation(GeoLocation geoLocation)
  {
    this.geoLocation = geoLocation;
  }
}
