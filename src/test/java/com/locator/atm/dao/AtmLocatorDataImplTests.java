package com.locator.atm.dao;

import com.locator.atm.LocatorAtmApplication;
import com.locator.atm.entity.LocatorApiResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LocatorAtmApplication.class)
@WebAppConfiguration
public class AtmLocatorDataImplTests
{
  @Autowired
  AtmLocatorData atmLocatorData;

  @Test
  public void getINGData() throws IOException
  {
    List<LocatorApiResponse> response = atmLocatorData.getINGData();
    assertEquals(1410, response.size());
  }
}