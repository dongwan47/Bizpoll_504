package classpart;

import java.util.List;

public class PracticeDAO {
//
//	public void practiceInfo(String name, String color, String numberOfLeaves, String bloom, String plantLength) {
//		System.out.println(name + "/" + color + "/" + numberOfLeaves + "/" + bloom + "/" + plantLength);
//	}

	public void practiceInfo(List<PracticeDTO> practiceList) {
		for (int i = 0; i < practiceList.size(); i++) {
			System.out.println("입력한 꽃 이름은 : " + practiceList.get(i).getName());
		}
	}
}
