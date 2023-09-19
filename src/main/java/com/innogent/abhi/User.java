package com.innogent.abhi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("user")
/* @Scope("prototype") */
public class User {

//	@Autowired
//	@Qualifier("insta")
	Applications applications;
	
	Date date;
	
	//@Autowired(required = false)
	@Autowired
	@Qualifier("getDate")
	public void setDate(Date date) {
		System.out.println("User.setDate()");
		this.date = date;
	}

	@Autowired
	public User(@Qualifier("shadiDotCom") Applications applications) {
		System.out.println("injection through constructor");
		this.applications = applications;
	}

	@Autowired
	@Qualifier("tele")
	public void setApplications(Applications applications) {
		System.out.println("setter method in users");
		this.applications = applications;
	}

}
