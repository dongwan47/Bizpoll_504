package com.bizpoll.lambda;

public class LambdaParameterExam3 {

	public static void main(String[] args) {
		Person2 person = new Person2();
		person .greeting(new Say2() {
			// java 1.7까지 사용방법
			@Override
			public int somethin(int a) {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
				System.out.println("paramater value is : " + a);
			
				return 7;
			}
		});

		System.out.println("===============================");
		// java 1.8이상부터 가능
		// (매개변수) -> {처리 내용}
		person.greeting((a) -> { // a를 감싸는 괄호가 생략되어도됨, 매개변수가 1개일경우 해당
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b" + a);
	
			return 8;
		});
	}
}
