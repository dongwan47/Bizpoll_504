package com.bizpoll.lambda;

public class LambdaMultiParameterExam4 {

	public static void main(String[] args) {
		Person2 person = new Person2();
		person .greeting(new Say2() {
			// java 1.7���� �����
			@Override
			public int somethin(int a) {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
				System.out.println("paramater value is : " + a + ", " + b);
			
				return 7;
			}
		});

		System.out.println("===============================");
		// java 1.8�̻���� ����
		// (�Ű�����) -> {ó�� ����}
		person.greeting((a, b) -> { // a�� ���δ� ��ȣ�� �����Ǿ��, �Ű������� 1���ϰ�� �ش�
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b" + a);
			System.out.println("paramater value is : " + a + ", " + b);
			
			return 8;
		});
	}
}
