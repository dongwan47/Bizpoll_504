package Moon;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("A = ");
		int A = scan.nextInt();
		System.out.println("B = ");
		int B = scan.nextInt();
		System.out.println("C = ");
		int C = scan.nextInt();

		System.out.println((A + B) % C);
		System.out.println((A % C + B % C) % C);
		System.out.println((A * B) % C);
		System.out.println((A % C * B % C) % C);

		scan.close();
	}
}
