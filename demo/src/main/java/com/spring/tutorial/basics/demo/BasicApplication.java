package com.spring.tutorial.basics.demo;

import com.spring.tutorial.basics.demo.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? - no need, all beans are in the same package as the main SpringBootApplication

	public static void main(String[] args) {

		//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		// Application context
		ApplicationContext applicationContext = SpringApplication.run(BasicApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch1);

		int result = binarySearch.search(new int[]{1, 12, 134, 108}, 99);
		System.out.println(result);
	}

}
