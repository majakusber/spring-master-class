package com.spring.tutorial.basics.demo;

import com.spring.tutorial.basics.demo.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicXmlContextApplication {

  private static final Logger logger = LoggerFactory.getLogger(BasicXmlContextApplication.class);

  // What are the beans?
  // What are the dependencies of a bean?
  // Where to search for beans? - no need, all beans are in the same package as the main SpringBootApplication

  public static void main(String[] args) {
    // Application context
    try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "applicationContext.xml")) {

      XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
      logger.info(personDAO.toString());
      logger.info(personDAO.getXmlJdbcConnection().toString());
    }
  }
}
