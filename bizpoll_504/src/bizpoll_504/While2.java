package bizpoll_504;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하시오");
			int a = sc.nextInt();

			if (a == 103) {
				System.out.println(a + "이 입력되어 종료합니다");
				break;
			}
			System.out.println("입력된 숫자 : " + a);
		}
	}
}
