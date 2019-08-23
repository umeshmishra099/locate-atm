package com.locator.atm.controller;

import com.locator.atm.TestUtil;
import com.locator.atm.entity.LocatorApiResponse;
import com.locator.atm.service.AtmLocatorService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class AtmLocatorControllerTests
{

  private List<LocatorApiResponse> expectedControllerResponse;

  @InjectMocks
  AtmLocatorController atmLocatorController;

  @Mock
  AtmLocatorService atmLocatorService;

  @Before
  public void setUp() throws Exception
  {

    MockitoAnnotations.initMocks(this);
    expectedControllerResponse = TestUtil.getExpectedResponse();
  }

  @Test
  public void getINGATMLocation() throws Exception
  {
    when(atmLocatorService.getINGATMLocation()).thenReturn(expectedControllerResponse);
    List<LocatorApiResponse> actualResponse = atmLocatorController.getINGATMLocation();
    assertEquals(expectedControllerResponse.size(), actualResponse.size());
  }

  @Test
  public void getINGATMLocationByCity() throws Exception
  {
    when(atmLocatorService.getINGATMLocationByCity("Rotterdam")).thenReturn(expectedControllerResponse);
    List<LocatorApiResponse> actualResponse = atmLocatorController.getINGATMLocationByCity("Rotterdam");
    assertEquals(expectedControllerResponse.size(), actualResponse.size());
  }
}