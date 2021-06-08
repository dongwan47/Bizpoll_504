package com.bizpoll.lambda;

public class Person2 {

	public void greeting(Say2 say) {
		int num = say.somethin(7); 
		System.out.println("Number is : " + num);
	}
}
