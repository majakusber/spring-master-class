package com.spring.tutorial.basics.demo.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCdiBusiness {

  @Autowired
  SomeCdiDao dao;

  public int getMax() {
    int max = Integer.MIN_VALUE;
    int[] data = dao.getData();
    for (int el : data) {
      if (el > max)
        max = el;
    }
    return max;
  }
}
