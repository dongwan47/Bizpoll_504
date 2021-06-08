package school;

public class Blackboard {

	public static void main(String[] args) {

		BlackboardDTO blDto = new BlackboardDTO();
		blDto.setBlackBoardwidth(5000);
		blDto.setBlackBoardLength(2000);
		blDto.setBlackBoardheight(100);
		blDto.setColor("white");

		BlackboardDAO blDao = new BlackboardDAO();

		blDao.blackBoardInfor(blDto);
	}

}
