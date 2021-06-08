package flower;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Violet {

	public static void main(String[] args) {

		List<VioletDTO> violetList = new ArrayList<VioletDTO>();
		while (true) {

			Scanner scan = new Scanner(System.in);
			System.out.println("이름 : ");
			String name = scan.nextLine();
			System.out.println("색깔 : ");
			String color = scan.nextLine();
			System.out.println("꽃잎개수 : ");
			String numberOfLeaves = scan.nextLine();
			System.out.println("개화기 : ");
			String bloom = scan.nextLine();
			System.out.println("수고 : ");
			String plantLength = scan.nextLine();
			VioletDTO violDto = new VioletDTO(name, color, numberOfLeaves, bloom, plantLength);
			violetList.add(violDto);

			VioletDAO violDao = new VioletDAO();
			violDao.violetInfo(violetList);
		}

	}
}
