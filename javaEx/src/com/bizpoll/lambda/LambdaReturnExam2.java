package com.bizpoll.lambda;

public class LambdaReturnExam2 {

	public static void main(String[] args) {
		Person1 person = new Person1();
		person .greeting(new Say1() {
			// java 1.7까지 사용방법
			@Override
			public int somethin() {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
			
				return 7;
			}
		});

		System.out.println("===============================");
		// java 1.8이상부터 가능
		// (매개변수) -> {처리 내용}
		person.greeting(() -> {
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b");
	
			return 8;
		});
	}
}
