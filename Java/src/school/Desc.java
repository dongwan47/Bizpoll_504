package school;

public class Desc {

	public static void main(String[] args) {
		
		DescDTO descDto = new DescDTO();
		descDto.setDescWidth(600);
		descDto.setDescLength(400);
		descDto.setDescHeight(700);
		descDto.setDescColor("brown");
		
		DescDAO descDao = new DescDAO();
		
		descDao.descInfo(descDto);
		
		
	}
}
