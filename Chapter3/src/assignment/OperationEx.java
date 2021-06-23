package assignment;

public class OperationEx {
	public static void main(String[] args) {
		int age = 24;
		System.out.println(age);

		int num = 10;
		int num2 = -num; // -부호연산자를 사용해도 num의 원래값은 변하지 않는다
		System.out.println(num);
		System.out.println(num2);

		num = -num; // 대입연산자를 사용하여 num의 값은 바꿀수 있다
		System.out.println(num);

	}
}
