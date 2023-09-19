package com.innogent.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@SpringBootApplication*/
@Configuration
@ComponentScan
public class FirstSpringBootProj1Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(FirstSpringBootProj1Application.class);
		User user=(User)applicationContext.getBean("user");
		System.out.println(user);
		user.applications.doubleClick();
		user.applications.rightSwipe();
		user.applications.singleClick();
		 
	}

}
