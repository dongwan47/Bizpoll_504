package zoo;

public class Beast {

	public static void main(String[] args) {

		BeastDTO bDto = new BeastDTO();
		bDto.setTiger("호랑이");
		bDto.setLion("사자");
		bDto.setPanda("판다");
		bDto.setMonkey("원숭이");
		bDto.setSnake("뱀");
		bDto.setLiger("라이거");

		BeastDAO bDao = new BeastDAO();

		bDao.beastInfo(bDto);

	}
}
