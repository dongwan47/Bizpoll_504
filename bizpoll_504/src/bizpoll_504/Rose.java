package bizpoll_504;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rose {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<RoseDTO> roseList = new ArrayList<RoseDTO>();
		while (true) {
			System.out.println("메뉴를 선택하세요.");
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

				RoseDTO rosDto = new RoseDTO(name, color, numberOfLeaves, bloom, plantLength);
				roseList.add(rosDto);

			} else if (menu == 2) {

				RoseDAO rosDao = new RoseDAO();
				rosDao.roseInfo(roseList);

			} else if (menu == 3) {
				System.exit(0);
			}
		}
	}
}
