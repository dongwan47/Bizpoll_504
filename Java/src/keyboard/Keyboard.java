package keyboard;

import java.util.ArrayList;
import java.util.List;

import flower.FlowerDTO;
import genesis.GenesisDTO;

public class Keyboard {

	public static void main(String[] args) {
		
		KeyboardDTO keybDto = new KeyboardDTO("탭", "시프트", "엔터");
		FlowerDTO floDto = new FlowerDTO("장미", "안개꽃", "튤립", "제비꽃");
		GenesisDTO genesDto = new GenesisDTO("하늘", "대지", "바다", "바람", "마음");
		
		List<KeyboardDTO> list = new ArrayList<>();
		List<FlowerDTO> lists = new ArrayList<>();
		List<GenesisDTO> listst = new ArrayList<>();
		
		list.add(keybDto);
		lists.add(floDto);
		listst.add(genesDto);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEnter());
			System.out.println(lists.get(i).getGypsophila());
			System.out.println(listst.get(i).getSea());
		}
		
//		KeyboardDTO keybDto = new KeyboardDTO();
//		keybDto.setEnter("엔터");
//		keybDto.setShift("시프트");
//		keybDto.setTab("탭");
//		
//		KeyboardDAO keybDao = new KeyboardDAO();
//		
//		keybDao.keyboardInfo(keybDto);
	}
	
	
}
