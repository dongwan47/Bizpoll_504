package teacher;

public class TeacherDTO {

	private int teacherID;
	private String teacherName;
	private int grade;
	private String address;

	public TeacherDTO() {
		// TODO Auto-generated constructor stub
	}

	public TeacherDTO(int teacherID, String teacherName, int grade, String address) {
		super();
		this.teacherID = teacherID;
		this.teacherName = teacherName;
		this.grade = grade;
		this.address = address;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
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
		return "TeacherDTO [teacherID=" + teacherID + ", teacherName=" + teacherName + ", grade=" + grade + ", address="
				+ address + "]";
	}

}
