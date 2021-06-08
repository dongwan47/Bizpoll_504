package com.bizpoll.lambda;

public class LambdaParameterExam3 {

	public static void main(String[] args) {
		Person2 person = new Person2();
		person .greeting(new Say2() {
			// java 1.7���� �����
			@Override
			public int somethin(int a) {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
				System.out.println("paramater value is : " + a);
			
				return 7;
			}
		});

		System.out.println("===============================");
		// java 1.8�̻���� ����
		// (�Ű�����) -> {ó�� ����}
		person.greeting((a) -> { // a�� ���δ� ��ȣ�� �����Ǿ��, �Ű������� 1���ϰ�� �ش�
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b" + a);
	
			return 8;
		});
	}
}
