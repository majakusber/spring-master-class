package com.spring.tutorial.basics.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

  @Override
  public int[] sort(int[] numbers) {
    return numbers;
  }

}
