package coffee;

import java.util.ArrayList;
import java.util.List;

import color.ColorDTO;
import flower.FlowerDTO;

public class Coffee {

	public static void main(String[] args) {

		CoffeeDTO coffDto = new CoffeeDTO("아메리카노", "카푸치노", "카페라뗴", "더치커피");
		FlowerDTO floDto = new FlowerDTO("장미", "안개꽃", "튤립", "제비꽃");

		List<CoffeeDTO> list = new ArrayList<>();
		List<FlowerDTO> lists = new ArrayList<>();

		list.add(coffDto);
		lists.add(floDto);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getDutchCoffee());
			System.out.println(lists.get(i).getViolet());
		}

	}

}
