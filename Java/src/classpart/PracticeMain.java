package classpart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {

		List<PracticeDTO> practiceList = new ArrayList<PracticeDTO>();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름");
		String name = scan.nextLine();
		System.out.println("색깔");
		String color = scan.nextLine();
		System.out.println("꽃잎개수");
		String numberOfLeaves = scan.nextLine();
		System.out.println("개화기");
		String bloom = scan.nextLine();
		System.out.println("수고");
		String plantLength = scan.nextLine();

		PracticeDTO pracDto = new PracticeDTO(name, color, numberOfLeaves, bloom, plantLength);
		practiceList.add(pracDto);

		PracticeDAO pracDao = new PracticeDAO();

		pracDao.practiceInfo(practiceList);

	}
}
