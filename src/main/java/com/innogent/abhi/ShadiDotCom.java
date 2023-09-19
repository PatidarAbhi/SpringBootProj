package com.innogent.abhi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ShadiDotCom implements Applications {
	
	public ShadiDotCom() {
		// TODO Auto-generated constructor stub
		System.out.println("ShadiDotCom.ShadiDotCom()");
	}

	@Override
	public void doubleClick() {
		System.out.println("Profile photo opening");
	}
    
	@Override
	public void rightSwipe() {
		System.out.println("intrested for shadi");
		
	}

	@Override
	public void singleClick() {
		System.out.println("Profile  opening");

	}

}
