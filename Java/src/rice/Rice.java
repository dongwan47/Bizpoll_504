package rice;

import java.util.ArrayList;
import java.util.List;

import color.ColorDTO;
import flower.FlowerDTO;
import zoo.BeastDTO;

public class Rice {

	public static void main(String[] args) {
		
		RiceDTO ricDto = new RiceDTO("백미", "보리", "흑미");
		FlowerDTO floDto = new FlowerDTO("장미", "안개꽃", "튤립", "제비꽃");
		ColorDTO colDto = new ColorDTO("사과", "오렌지", "레몬", "라임", "블루베리", "가지", "포도");
		BeastDTO beaDto = new BeastDTO("호랑이", "사자", "판다", "원숭이", "뱀", "라이거");
				
		
		List<RiceDTO> list = new ArrayList<>();
		List<FlowerDTO> lists = new ArrayList<>();
		List<ColorDTO> listst = new ArrayList<>();
		List<BeastDTO> liststs = new ArrayList<>();
		
		list.add(ricDto);
		lists.add(floDto);
		listst.add(colDto);
		liststs.add(beaDto);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getBlack());
			System.out.println(lists.get(i).getGypsophila());
			System.out.println(listst.get(i).getRed());
			System.out.println(liststs.get(i).getPanda());
		}
	}
	
}
