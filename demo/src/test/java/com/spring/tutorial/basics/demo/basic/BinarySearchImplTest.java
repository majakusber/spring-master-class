package com.spring.tutorial.basics.demo.basic;

import static org.junit.jupiter.api.Assertions.*;

import com.spring.tutorial.basics.demo.BasicApplication;
import com.spring.tutorial.basics.demo.BasicXmlContextApplication;
import com.spring.tutorial.basics.demo.PropertiesApplication;
import com.spring.tutorial.basics.demo.ScopeApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/testContext.xml")
//@ContextConfiguration(classes = BasicApplication.class)
class BinarySearchImplTest {

  @Autowired
  BinarySearchImpl binarySearch;

  @Test
  void search() {
    int actual = binarySearch.search(new int[]{}, 3);
    assertEquals(108, actual);
  }
}