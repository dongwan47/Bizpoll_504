package space;

public class MVCSpring {

	public static void main(String[] args) {

		MVCSpringDTO mvcsDto = new MVCSpringDTO();
		mvcsDto.setChoi("최광우");
		mvcsDto.setJo("조영창");
		mvcsDto.setJung("정민철");
		mvcsDto.setLee("이동희");
		mvcsDto.setLim("임동완");

		MVCSpringDAO mvcsDao = new MVCSpringDAO();

		mvcsDao.mvcSpringInfo(mvcsDto);

	}

}
