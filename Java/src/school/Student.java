package school;

public class Student {

	public static void main(String[] args) {
		
		StudentDTO stuDto = new StudentDTO();
		stuDto.setAddress("aa");
		stuDto.setGrade(3);
		stuDto.setStudentID(123);
		stuDto.setStudentName("bb");
	
		StudentDAO stuDao = new StudentDAO();
		
		stuDao.studentInfo(stuDto);
	}
		

}
