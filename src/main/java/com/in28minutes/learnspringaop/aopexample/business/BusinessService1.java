package com.in28minutes.learnspringaop.aopexample.business;

import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class BusinessService1 {

  private DataService1 dataService;

  public BusinessService1(DataService1 dataService) {
    this.dataService = dataService;
  }

  public int calculateMax() {
    int[] data = dataService.retrieveData();
    return Arrays.stream(data).max().orElse(0);
  }
}
