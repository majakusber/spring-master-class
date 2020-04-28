package com.spring.tutorial.basics.demo.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

  private static final Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

  @Autowired
  @Qualifier("bubble")
  private SortAlgorithm sortAlgorithm;

  public int search(int[] numbers, int numberToSearchFor) {
    System.out.println(sortAlgorithm);
    int[] sortedNumbers = sortAlgorithm.sort(numbers);

    // search the array
    return 108;
  }

  @PostConstruct
  void postConstruct() {
    logger.info("postConstruct");
  }

  @PreDestroy
  void preDestroy() {
    logger.info("preDestroy");
  }
}
