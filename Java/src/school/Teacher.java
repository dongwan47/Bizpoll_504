package school;

public class Teacher {

	public static void main(String[] args) {

		TeacherDTO teaDto = new TeacherDTO();
		teaDto.setTeacherID(123456);
		teaDto.setTeacherName("홍길동");
		teaDto.setGrade(3);
		teaDto.setAddress("죠스떡볶이");

		TeacherDAO teaDao = new TeacherDAO();

		teaDao.teacherInfo(teaDto);
	}
}
