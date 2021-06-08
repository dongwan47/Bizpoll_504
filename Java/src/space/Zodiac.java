package space;

import java.awt.BufferCapabilities.FlipContents;
import java.util.ArrayList;
import java.util.List;

import drink.DrinkDTO;
import flower.FlowerDTO;
import zoo.BeastDTO;

public class Zodiac {

	public static void main(String[] args) {

//		ZodiacDTO zodiDto = new ZodiacDTO();
//		zodiDto.setAquarius("물병자리");
//		zodiDto.setPisces("물고기자리");
//		zodiDto.setAries("양자리");
//		zodiDto.setTaurus("황소자리");
//		zodiDto.setGemini("쌍둥이자리");
//		zodiDto.setCancer("게자리");
//		zodiDto.setLeo("사자자리");
//		zodiDto.setVirgo("처녀자리");
//		zodiDto.setLibra("천칭자리");
//		zodiDto.setScorpio("전갈자리");
//		zodiDto.setSagittarius("궁수자리");
//		zodiDto.setCapricorn("염소자리");

		ZodiacDTO zodiDto = new ZodiacDTO("물병", "물고기", "양", "황소", "쌍둥이", "게", "사자", "처녀", "천칭", "전갈", "궁수", "염소");
		BeastDTO beaDto = new BeastDTO("호랑이", "사자", "판다", "원숭이", "뱀", "라이거");
		FlowerDTO floDto = new FlowerDTO("장미", "안개꽃", "튤립", "제비꽃");
		DrinkDTO driDto = new DrinkDTO("커피", "코카콜라", "칠성사이다", "환타", "녹차");
		
		List<ZodiacDTO> list = new ArrayList<>();
		List<BeastDTO> lists = new ArrayList<>();
		List<FlowerDTO> listst = new ArrayList<>();
		List<DrinkDTO>liststs = new ArrayList<>();
		

		list.add(zodiDto);
		lists.add(beaDto);
		listst.add(floDto);
		liststs.add(driDto);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getLeo());
			System.out.println(lists.get(i).getPanda());
			System.out.println(listst.get(i).getGypsophila());
			System.out.println(liststs.get(i).getCilsungCider());
		}
	}

}
