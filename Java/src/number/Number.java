package number;

import java.util.ArrayList;
import java.util.List;

import drink.DrinkDAO;
import drink.DrinkDTO;

public class Number {

	public static void main(String[] args) {
		
		NumberDTO numDto = new NumberDTO(1, 2, 3, 4, 5);
		DrinkDTO driDTO = new DrinkDTO("커피", "코카콜라", "칠성사이다", "환타", "녹차");
		
		List<NumberDTO> list = new ArrayList<>();
		List<DrinkDTO> lists = new ArrayList<>();
		
		list.add(numDto);
		lists.add(driDTO);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getOne());
			
		}
		NumberDAO numDao = new NumberDAO();
		DrinkDAO dri = new DrinkDAO();
		
		numDao.numberInfo(numDto);
		dri.drinkInfo(driDTO);
	}

}
