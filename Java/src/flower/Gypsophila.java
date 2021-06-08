package flower;

import java.util.Scanner;

public class Gypsophila {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름");
		String name = scan.nextLine();
		System.out.println("색깔");
		String color = scan.nextLine();
		System.out.println("수고");
		int plantLength = scan.nextInt();
		System.out.println("꽃잎개수");
		int numberOfLeaves = scan.nextInt();
		System.out.println("개화기");
		int bloom = scan.nextInt();
		
		GypsophilaDTO gypsDto = new GypsophilaDTO(name, color, plantLength, numberOfLeaves, bloom);
		
		GypsophilaDAO gypsDao = new GypsophilaDAO();
		
		gypsDao.gypsophiInfo(name, color, plantLength, numberOfLeaves, bloom);
	}
}
