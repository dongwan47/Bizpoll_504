package com.bizpoll.lambda;

public class LambdaDefaultExam {

	public static void main(String[] args) {
		Person person = new Person();
		person.greeting(new Say() {
			// java 1.7까지 사용방법
			@Override
			public void somethin() {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
			}
		});

		System.out.println("===============================");
		// java 1.8이상부터 가능
		// (매개변수) -> {처리 내용}
		person.greeting(() -> {
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b");
		});
	}
}
