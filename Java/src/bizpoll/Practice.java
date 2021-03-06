package bizpoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 학생의 점수를 받아 수우미양가를 보여주는 프로그램을 만드세요.
 * 조건1. 점수가 -1이면 프로그램을 종료합니다.
 */

public class Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<PracticeDTO> practiceList = new ArrayList<PracticeDTO>();
		while (true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1 : 꽃 정보입력");
			System.out.println("2 : 꽃 정보출력");
			System.out.println("3 : 프로그램종료");
			int menu = scan.nextInt();
			if (menu == 1) {
				scan.nextLine();
				System.out.println("이름");
				String name = scan.nextLine();
				System.out.println("색깔");
				String color = scan.nextLine();
				System.out.println("꽃잎개수");
				int numberOfLeaves = scan.nextInt();
				System.out.println("개화기");
				int bloom = scan.nextInt();
				System.out.println("수고");
				int plantLength = scan.nextInt();

				PracticeDTO pracDto = new PracticeDTO(name, color, numberOfLeaves, bloom, plantLength);
				practiceList.add(pracDto);

			} else if (menu == 2) {
				System.out.println(practiceList);
			} else if (menu == 3) {
				System.exit(0);
			}
		}
	}
}
