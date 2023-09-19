package com.innogent.abhi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/* @Primary */
@Qualifier("insta")
public class Instagram implements Applications {
	
	public Instagram() {
		// TODO Auto-generated constructor stub
		System.out.println("Instagram.Instagram()");
	}

	@Override
	public void doubleClick() {
		System.out.println("post like");

	}

	@Override
	public void rightSwipe() {
		System.out.println("chat open");
		
	}

	@Override
	public void singleClick() {
		System.out.println("mute/unmute");

	}

}
