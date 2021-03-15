package br.com.cee.util;

import java.util.Random;

public class Computer {
	
	public static int getOption() {
		
		Random randomNumber = new Random();
        return randomNumber.nextInt(3);	
		
	}
	
	
	

}
