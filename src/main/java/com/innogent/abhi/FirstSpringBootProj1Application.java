package com.innogent.abhi;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@SpringBootApplication*/
@Configuration
@ComponentScan
public class FirstSpringBootProj1Application {

	@Bean
	public Date getDate() {
		System.out.println("FirstSpringBootProj1Application.getDate()");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date currentDate = new Date();
		String formattedDate = sdf.format(currentDate);
		String dateString = "2022-09-25 13:45:30";
		Date parsedDate=null;
		try {
			 parsedDate = sdf.parse(dateString);
			System.out.println("Parsed Date: " + parsedDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return parsedDate;
	}

	

	@Bean
	public Date get1Date() {
		System.out.println("FirstSpringBootProj1Application.getDate1()");
		return new Date();
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				FirstSpringBootProj1Application.class);
		// User user1 = applicationContext.getBean("user", User.class); we can write
		// like this also
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
		System.out.println("welcome");
		System.out.println(user.date);
		user.applications.doubleClick();
		user.applications.rightSwipe();
		user.applications.singleClick();
		Date date = (Date) applicationContext.getBean("getDate");
		System.out.println(date);
		applicationContext.close();

		/*
		 * User user1 = (User) applicationContext.getBean("user");
		 * System.out.println(user1); user1.applications.doubleClick();
		 * user1.applications.rightSwipe(); user1.applications.singleClick();
		 */

	}

}
