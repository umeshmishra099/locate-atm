package com.locator.atm.dao;

import com.locator.atm.entity.LocatorApiResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public interface AtmLocatorData
{
  List<LocatorApiResponse> getINGData() throws IOException;
}
