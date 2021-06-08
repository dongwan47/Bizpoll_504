package school;

public class Subject {

	public static void main(String[] args) {

		SubjectDTO subjectDto = new SubjectDTO();
		subjectDto.setKorean("국어");
		subjectDto.setMath("수학");
		subjectDto.setEnglish("영어");
		subjectDto.setHistory("역사");
		subjectDto.setMusic("음악");
		
		SubjectDAO subjectDao = new SubjectDAO();
		
		subjectDao.subjectInfo(subjectDto);
		
		
	}
}
