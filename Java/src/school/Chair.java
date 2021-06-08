package school;

public class Chair {

	public static void main(String[] args) {

		ChairDTO chaDto = new ChairDTO();
		chaDto.setChairWidth(400);
		chaDto.setChairLength(400);
		chaDto.setChairheight(800);
		chaDto.setChairColor("forestGreen");

		ChairDAO chaDao = new ChairDAO();

		chaDao.chairInfo(chaDto);

	}
}
