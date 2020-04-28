package com.spring.tutorial.basics.demo;

import com.spring.tutorial.basics.demo.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

  private static final Logger logger = LoggerFactory.getLogger(PropertiesApplication.class);

  // What are the beans?
  // What are the dependencies of a bean?
  // Where to search for beans? - no need, all beans are in the same package as the main SpringBootApplication

  public static void main(String[] args) {
    // Application context
    try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        PropertiesApplication.class)) {

      SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
      logger.info("Service URL: {}", service.getUrl());
    }
  }
}
