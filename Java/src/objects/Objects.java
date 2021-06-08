package objects;

public class Objects {

	public static void main(String[] args) {

		ObjectsDTO objDto = new ObjectsDTO();

		objDto.setBook("책");
		objDto.setCup("컵");
		objDto.setPack("가방");
		objDto.setPenCase("필통");
		objDto.setPhone("휴대폰");
		objDto.setShoose("신발");

		ObjectsDAO objDao = new ObjectsDAO();

		objDao.objectsInfo(objDto);
	}

}
