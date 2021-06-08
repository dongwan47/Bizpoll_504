package maxim;

import java.util.ArrayList;
import java.util.List;

import flower.VioletDTO;
import rice.RiceDTO;

public class Maxim {

	public static void main(String[] args) {
		
		MaximDTO maxDto = new MaximDTO("오리지널", "모카", "화이트골드");
		RiceDTO ricDto = new RiceDTO("백미", "보리", "흑미");
//		maxDto.setOrigenal("오리지널");
//		maxDto.setMoka("모카");
//		maxDto.setWhiteGold("화이트골드");
		
		List<MaximDTO> list = new ArrayList<>();
		List<VioletDTO> lists = new ArrayList<>();
		List<RiceDTO> listst = new ArrayList<>();
		
		list.add(maxDto);
		listst.add(ricDto);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getOrigenal());
			System.out.println(lists.get(i).getName());
			System.out.println(listst.get(i).getBlack());
		}
		
		
//		MaximDAO maxDao = new MaximDAO();
		
	}
}
