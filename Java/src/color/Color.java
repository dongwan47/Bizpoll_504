package color;

import java.util.ArrayList;
import java.util.List;

import drink.DrinkDTO;
import flower.FlowerDTO;
import zoo.BeastDTO;

public class Color {

	public static void main(String[] args) {

		ColorDTO cDto = new ColorDTO("사과", "오렌지", "레몬", "라임", "블루베리", "가지", "포도");
		FlowerDTO floDto = new FlowerDTO("장미", "안개꽃", "튤립", "제비꽃");
		BeastDTO beaDto = new BeastDTO("호랑이", "사자", "판다", "원숭이", "뱀", "라이거");
		DrinkDTO driDto = new DrinkDTO("커피", "코카콜라", "칠성사이다", "환타", "녹차");
//		cDto.setRed("빨강");
//		cDto.setOrange("주홍");
//		cDto.setYellow("노랑");
//		cDto.setGreen("초록");
//		cDto.setBlue("파랑");
//		cDto.setNavy("진곤");
//		cDto.setPupple("보라");
		List<ColorDTO> list = new ArrayList<>();
		List<FlowerDTO> lists = new ArrayList<>();
		List<BeastDTO> listst = new ArrayList<>();
		List<DrinkDTO> liststs = new ArrayList<>();
		
		list.add(cDto);
		lists.add(floDto);
		listst.add(beaDto);
		liststs.add(driDto);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getYellow());
			System.out.println(lists.get(i).getViolet());
			System.out.println(listst.get(i).getPanda());
			System.out.println(liststs.get(i).getGreenTea());
			
			
		}
	}
}
