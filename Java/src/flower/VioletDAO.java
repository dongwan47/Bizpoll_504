package flower;

import java.util.List;

public class VioletDAO {

	public void violetInfo(List<VioletDTO> violetList) {
		for (int i = 0; i < violetList.size(); i++) {
			System.out.println("입력한 꽃 이름은 : " + violetList.get(i).getName());
			System.out.println("입력한 꽃 색깔은 : " + violetList.get(i).getColor());
			System.out.println("입력한 꽃 잎개수는 : " + violetList.get(i).getNumberOfLeaves());
			System.out.println("입력한 꽃 개화기는 : " + violetList.get(i).getBloom());
			System.out.println("입력한 꽃 수고는 : " + violetList.get(i).getPlantLength());
		}
	}
}
