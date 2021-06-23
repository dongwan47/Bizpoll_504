package bizpoll_504;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1 : 학생정보입력");
			System.out.println("2 : 학생정보출력");
			System.out.println("3 : 프로그램종료");
			int menu = scan.nextInt();
			if (menu == 1) {
				scan.nextLine();
				System.out.println("성별(m/f)");
				String gender = scan.nextLine();
				System.out.println("이름");
				String name = scan.nextLine();
				System.out.println("학번");
				int id = scan.nextInt();
				System.out.println("교실");
				int classroom = scan.nextInt();
				System.out.println("주소");
				String address = scan.nextLine();

				ReviewDTO revDto = new ReviewDTO(gender, name, id, classroom, address);
				reviewList.add(revDto);

			} else if (menu == 2) {

				ReviewDAO revDao = new ReviewDAO();
				revDao.reviewInfo(reviewList);

			} else if (menu == 3) {
				System.exit(0);
			}
		}
	}
}
