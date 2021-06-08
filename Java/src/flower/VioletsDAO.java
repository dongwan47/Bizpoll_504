package flower;

import java.util.List;

public class VioletsDAO {

//	public void violetInfo(String name, String color, int numberOfLeaves, int bloom, int plantLength) {
//		System.out.println(name + "/" + color + "/" + numberOfLeaves + "/" + bloom + "/" + plantLength);
//	}
	
	public void violetInfo(List<VioletsDTO> violetsList) {
		for (int i = 0; i < violetsList.size(); i++) {
			System.out.println("입력한 꽃 이름은 : " + violetsList.get(i).getName());
		}
	}
}
