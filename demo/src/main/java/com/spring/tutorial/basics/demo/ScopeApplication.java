package com.spring.tutorial.basics.demo;

import com.spring.tutorial.basics.demo.scope.PersonDAO;
import com.spring.tutorial.basics.scan.scope.ScanPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.tutorial.basics.demo")
@ComponentScan("com.spring.tutorial.basics.scan")
public class ScopeApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);

  // What are the beans?
  // What are the dependencies of a bean?
  // Where to search for beans? - no need, all beans are in the same package as the main SpringBootApplication

  public static void main(String[] args) {

    // Application context
    try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        ScopeApplication.class)) {

      PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
      PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

      LOGGER.info("personDAO: {}", personDAO);
      LOGGER.info("{}", personDAO.getJdbcConnection());
      LOGGER.info("personDAO1: {}", personDAO1);
      LOGGER.info("{}", personDAO1.getJdbcConnection());

      ScanPersonDAO scanPersonDAO = applicationContext.getBean(ScanPersonDAO.class);

      LOGGER.info("scanPersonDAO: {}", scanPersonDAO);
    }
  }
}
