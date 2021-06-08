package com.bizpoll.lambda;

public class LambdaDefaultExam {

	public static void main(String[] args) {
		Person person = new Person();
		person.greeting(new Say() {
			// java 1.7���� �����
			@Override
			public void somethin() {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
			}
		});

		System.out.println("===============================");
		// java 1.8�̻���� ����
		// (�Ű�����) -> {ó�� ����}
		person.greeting(() -> {
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b");
		});
	}
}
