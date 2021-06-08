package teacher;

public class Teacher {

	public static void main(String[] args) {

		TeacherDTO teaDto = new TeacherDTO();
		teaDto.setAddress("aa");
		teaDto.setGrade(3);
		teaDto.setTeacherID(123);
		teaDto.setTeacherName("bb");
		
		TeacherDAO teaDao = new TeacherDAO();
		
		teaDao.teacherInfo(teaDto);
		
	}
}
