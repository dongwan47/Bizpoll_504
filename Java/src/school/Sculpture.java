package school;

public class Sculpture {

	public static void main(String[] args) {

		SculptureDTO scuDto = new SculptureDTO();
		scuDto.setPlayGround("운동장");
		scuDto.setPond("연못");
		scuDto.setStatue("동상");
		scuDto.setTree("나무");
		scuDto.setZeolite("비석");

		SculptureDAO scuDao = new SculptureDAO();

		scuDao.sculptureInfo(scuDto);
	}
}
