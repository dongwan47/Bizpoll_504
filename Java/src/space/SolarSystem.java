package space;

import java.util.ArrayList;
import java.util.List;

import objects.ObjectsDTO;
import teacher.TeacherDTO;
import zoo.BeastDTO;

public class SolarSystem {

	public static void main(String[] args) {

//		SolarSystemDTO solarDto = new SolarSystemDTO();
//		solarDto.setSun("태양");
//		solarDto.setMercury("수성");
//		solarDto.setVenus("금성");
//		solarDto.setEarth("지구");
//		solarDto.setMars("화성");
//		solarDto.setJupiter("목성");
//		solarDto.setSaturn("토성");
//		solarDto.setUranus("천왕성");
//		solarDto.setNaptune("해왕성");
//		solarDto.setPluto("명왕성");

		SolarSystemDTO solarDto = new SolarSystemDTO("태양", "수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "해왕성", "명왕성");
//		MVCSpringDTO MVCSDto = new MVCSpringDTO("조영창", "b", "c", "d", "e");
		ObjectsDTO objDto = new ObjectsDTO("컵", "필통", "폰", "책", "신발", "가방");
		TeacherDTO teacDto = new TeacherDTO(123, "성춘향", 3, "매곡동");
		BeastDTO beaDto = new BeastDTO("호랑이", "사자", "판다", "원숭이", "뱀", "라이거");

		List<SolarSystemDTO> list = new ArrayList<>();
//		List<MVCSpringDTO> lists = new ArrayList<>();
		List<ObjectsDTO> lists = new ArrayList<>();
		List<TeacherDTO> listt = new ArrayList<>();
		List<BeastDTO> listss = new ArrayList<>();

		list.add(solarDto);
//		lists.add(MVCSDto);
		lists.add(objDto);
		listt.add(teacDto);
		listss.add(beaDto);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getJupiter());
//			System.out.println(list.get(i).getEarth());
//			System.out.println(list.get(i).getMars());
			System.out.println(lists.get(i).getPenCase());
			System.out.println(listt.get(i).getTeacherName());
//			System.out.println(lists.get(i).toString());
			System.out.println(listss.get(i).getPanda());
			System.out.println(list.get(i).getNaptune());
		}
	}

}
