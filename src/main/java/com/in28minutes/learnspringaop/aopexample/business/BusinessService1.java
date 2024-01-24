package com.in28minutes.learnspringaop.aopexample.business;

import java.util.Arrays;
import org.springframework.stereotype.Service;

import com.in28minutes.learnspringaop.aopexample.data.DataService1;

@Service
public class BusinessService1 {

  private DataService1 dataService;

  public BusinessService1(DataService1 dataService) {
    this.dataService = dataService;
  }

  public int calculateMax() throws InterruptedException {
    int[] data = dataService.retrieveData();
    // throw new RuntimeException("Something went wrong!");
    Thread.sleep(30);
    return Arrays.stream(data).max().orElse(0);
  }
}
