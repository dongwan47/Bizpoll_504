package bizpoll_504;

import java.util.List;

public class RoseDAO {
	public void roseInfo(List<RoseDTO> roseList) {
		for (int i = 0; i < roseList.size(); i++) {
			System.out.println("입력한 꽃 이름은 : " + roseList.get(i).getName());
			System.out.println("입력한 꽃 색깔은 : " + roseList.get(i).getColor());
			System.out.println("입력한 꽃 잎개수는 : " + roseList.get(i).getNumberOfLeaves());
			System.out.println("입력한 꽃 개화기는 : " + roseList.get(i).getBloom());
			System.out.println("입력한 꽃 수고는 : " + roseList.get(i).getPlantLength());
		}
	}
}
