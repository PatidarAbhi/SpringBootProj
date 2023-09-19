package com.innogent.abhi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
	Applications applications;

	/*
	 * public User() { System.out.println("User.User()"); }
	 */

	@Autowired
	public User(@Qualifier("shadi") Applications applications) {
		System.out.println("injection through constructor");
		this.applications = applications;
	}

	public Applications getApplications() {
		return applications;
	}

	@Autowired
	@Qualifier("insta")
	public void setApplications(Applications applications) {
		System.out.println("setter method in users");
		this.applications = applications;
	}

}
