package com.locator.atm.service;

import com.locator.atm.TestUtil;
import com.locator.atm.dao.AtmLocatorData;
import com.locator.atm.entity.LocatorApiResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AtmLocatorServiceTests
{
  private List<LocatorApiResponse> expectedServiceResponse;

  @InjectMocks
  private AtmLocatorService atmLocatorService;

  @Mock
  private AtmLocatorData atmLocatorData;

  @Before
  public void setUp()
  {
    MockitoAnnotations.initMocks(this);
    expectedServiceResponse = TestUtil.getExpectedResponse();
  }

  @Test
  public void getINGATMLocation() throws Exception
  {
    Mockito.when(atmLocatorData.getINGData()).thenReturn(expectedServiceResponse);
    List<LocatorApiResponse> actualResponse = atmLocatorService.getINGATMLocation();
    assertEquals(expectedServiceResponse.size(), actualResponse.size());
  }

  @Test
  public void getINGATMLocationByCity() throws Exception
  {
    Mockito.when(atmLocatorData.getINGData()).thenReturn(expectedServiceResponse);
    List<LocatorApiResponse> actualResponse = atmLocatorService.getINGATMLocationByCity("Amsterdam");
    assertEquals(2, actualResponse.size());
  }
}