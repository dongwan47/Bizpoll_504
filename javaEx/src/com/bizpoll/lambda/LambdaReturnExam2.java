package com.bizpoll.lambda;

public class LambdaReturnExam2 {

	public static void main(String[] args) {
		Person1 person = new Person1();
		person .greeting(new Say1() {
			// java 1.7���� �����
			@Override
			public int somethin() {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
			
				return 7;
			}
		});

		System.out.println("===============================");
		// java 1.8�̻���� ����
		// (�Ű�����) -> {ó�� ����}
		person.greeting(() -> {
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b");
	
			return 8;
		});
	}
}
