package com.spring.tutorial.basics.demo.cdi;

import org.springframework.stereotype.Component;

@Component
public class SomeCdiDao {

  public int[] getData() {
    return new int[]{19, 27, 198};
  }
}
