package school;

/* 일반적으로 DTO는 로직을 가지고 있지 않은 
 * 순수한 데이터의 객체이며 
 * 객체의 속성과 그 속성의 접근을 위한 
 * getter 및 setter 메소드만을 가지고 있다.
 */
public class StudentDTO {
	private int studentID;
	private String studentName;
	private int grade;
	private String address;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "StudentDTO [studentID=" + studentID + ", studentName=" + studentName + ", grade=" + grade + ", address="
				+ address + "]";
	}

	
	
}
