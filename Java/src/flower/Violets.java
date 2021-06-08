package flower;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Violets {

	public static void main(String[] args) {
			
		List<VioletsDTO> violetsList = new ArrayList<VioletsDTO>();
		while (true) {
		Scanner scan = new Scanner(System.in);
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

		VioletsDTO violDto = new VioletsDTO(name, color, numberOfLeaves, bloom, plantLength);
		violetsList.add(violDto);
		
		VioletsDAO violDao = new VioletsDAO();

		violDao.violetInfo(violetsList);
		}

	}
}
