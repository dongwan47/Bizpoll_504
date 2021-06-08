package school;

public class TeacherDTO {

	private int teacherID;
	private String teacherName;
	private int grade;
	private String address;

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
