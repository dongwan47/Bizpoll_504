package bizpoll_504;

import java.util.Scanner;

public class Bizpoll {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1 : 꽃 정보입력");
			System.out.println("2 : 꽃 정보출력");
			System.out.println("3 : 프로그램종료");
			int flowerInfo = scan.nextInt();
			if (flowerInfo == 1) {

			} else if (flowerInfo == 2) {

			} else if (flowerInfo == 3) {
				System.exit(0);
			}
		}
	}
}
