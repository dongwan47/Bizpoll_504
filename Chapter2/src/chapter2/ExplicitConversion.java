package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
//		double dNum1 = 1.2;
//		float fNum2 = 0.9F;
//
//		int iNum3 = (int) dNum1 + (int) fNum2; // 1
//		int iNum4 = (int) (dNum1 + fNum2); // 2
//		System.out.println(iNum3);
//		System.out.println(iNum4);

		int a = 10;
		double b = 2.0;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a * b);
		System.out.println(b % a);
		
		
		char ch1 = '퓽';
		char ch2 = '\uD4EC';
		
		System.out.println(ch1);
		System.out.println(ch2);
	}
}
