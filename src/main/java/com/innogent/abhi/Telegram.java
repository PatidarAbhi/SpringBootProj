package com.innogent.abhi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Qualifier("tele")
public class Telegram implements Applications {
	
	public Telegram() {
		// TODO Auto-generated constructor stub
		System.out.println("Telegram.Telegram()");
	}

	@Override
	public void doubleClick() {
		System.out.println("Telegram.doubleClick()");

	}

	@Override
	public void rightSwipe() {
		// TODO Auto-generated method stub
		System.out.println("Telegram.rightSwipe()");

	}

	@Override
	public void singleClick() {
		// TODO Auto-generated method stub
		System.out.println("Telegram.singleClick()");

	}
	
	@PostConstruct
	public void creation()
	{
		System.out.println("before Telegram initialaize");
	}
	
	@PreDestroy
	public void destoryte()
	{
		System.out.println("destroy Telegram initialaize");
	}

}
