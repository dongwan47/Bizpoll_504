package oneweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import flower.FlowerDTO;
import genesis.GenesisDTO;
import rice.RiceDTO;
import zoo.BeastDTO;

public class oneWeek {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름: ");
		String name = scan.nextLine();
		System.out.println("직업: ");
		String job = scan.nextLine();
		System.out.println("사번: ");
		int num = scan.nextInt();
		
		System.out.println("==============");
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
		oneWeekDTO onewDto = new oneWeekDTO("일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일");
		GenesisDTO genesDto = new GenesisDTO("하늘", "대지", "바다", "바람", "마음");
		FlowerDTO floDto = new FlowerDTO("장미", "안개꽃", "튤립", "제비꽃");
		BeastDTO beasDto = new BeastDTO("호랑이", "사자", "판다", "원숭이", "뱀", "라이거");
		RiceDTO ricDto = new RiceDTO("백미", "보리", "흑미");
		
		List<oneWeekDTO> list = new ArrayList<>();
		List<GenesisDTO> lists = new ArrayList<>();
		List<FlowerDTO> listst = new ArrayList<>();
		List<BeastDTO> liststs = new ArrayList<>();
		List<RiceDTO> liststst = new ArrayList<>();
		
		list.add(onewDto);
		lists.add(genesDto);
		listst.add(floDto);
		liststs.add(beasDto);
		liststst.add(ricDto);

		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getMonday());
//			System.out.println(lists.get(i).getWind());
//			System.out.println(listst.get(i).getViolet());
//			System.out.println(liststs.get(i).getPanda());
//			System.out.println(liststst.get(i).getYellow());
		}
	}

}
