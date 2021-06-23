package bizpoll_504;

public class Students {
	public static void main(String[] args) {
		StudentsDTO stuDto = new StudentsDTO();
		stuDto.setGender("성별");
		stuDto.setName("이름");
		stuDto.setGrade("학년");
		stuDto.setAddress("주소");
		
		StudentsDAO stuDao = new StudentsDAO();
		stuDao.studentsInfo(stuDto);
	}
	
}
