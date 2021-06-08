package sky;

import java.util.ArrayList;
import java.util.List;

import color.ColorDTO;
import flower.FlowerDTO;
import objects.ObjectsDTO;
import zoo.BeastDTO;

public class Sky {

	public static void main(String[] args) {
		
		SkyDTO skDto = new SkyDTO("태양", "구름");
		BeastDTO besDto = new BeastDTO("호랑이" , "사자", "판다", "원숭이", "뱀", "라이거");
		ObjectsDTO objDto = new ObjectsDTO("컵", "필통", "폰", "책", "신발", "가방");
		ColorDTO colDto = new ColorDTO("사과", "오렌지", "레몬", "라임", "블루베리", "가지", "포도");
		FlowerDTO floDto = new FlowerDTO("장미", "안개꽃", "튤립", "제비꽃");
		
		List<SkyDTO> list = new ArrayList<>();
		List<BeastDTO> lists = new ArrayList<>();
		List<ObjectsDTO> listss = new ArrayList<>();
		List<ColorDTO> listtt = new ArrayList<>();
		List<FlowerDTO> listst = new ArrayList<>();
		
		list.add(skDto);
		lists.add(besDto);
		listss.add(objDto);
		listtt.add(colDto);
		listst.add(floDto);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(listss.get(i).getPenCase());
			System.out.println(list.get(i).getSun());
			System.out.println(lists.get(i).getLion());
			System.out.println(listtt.get(i).getGreen());
			System.out.println(listst.get(i).getViolet());
		}
	
		
		
	}
	
}
