package genesis;

import java.util.ArrayList;
import java.util.List;

public class Genesis {
	public static void main(String[] args) {

		GenesisDTO gDto = new GenesisDTO("하늘", "대지", "바다", "바람", "마음");

		List<GenesisDTO> list = new ArrayList<GenesisDTO>();

		list.add(gDto);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getWind());
		}

		GenesisDAO gDao = new GenesisDAO();

		gDao.genesisInfo(gDto);
	}
}
