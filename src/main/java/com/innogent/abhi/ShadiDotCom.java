package com.innogent.abhi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("shadi")
public class ShadiDotCom implements Applications {

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
