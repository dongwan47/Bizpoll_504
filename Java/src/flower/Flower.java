package flower;

import java.util.ArrayList;
import java.util.List;

import rice.RiceDTO;
import zoo.BeastDTO;

public class Flower {

	public static void main(String[] args) {

		FlowerDTO fDto = new FlowerDTO("장미", "안개꽃", "튤립", "제비꽃");
		BeastDTO beaDto = new BeastDTO("호랑이", "사자", "판다", "원숭이", "뱀", "라이거");
		RiceDTO ricDto = new RiceDTO("백미", "보리", "흑미");
		
		List<FlowerDTO> list = new ArrayList<>();
		List<BeastDTO> lists = new ArrayList<>();
		List<RiceDTO> listst = new ArrayList<>();
		
		list.add(fDto);
		lists.add(beaDto);
		listst.add(ricDto);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getGypsophila());
			System.out.println(lists.get(i).getPanda());
			System.out.println(listst.get(i).getBlack());
		}

	}
}
