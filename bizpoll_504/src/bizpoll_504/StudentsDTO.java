package bizpoll_504;

public class StudentsDTO {
	private String gender;
	private String name;
	private String grade;
	private String address;

	public StudentsDTO() {
		// TODO Auto-generated constructor stub
	}

	public StudentsDTO(String gender, String name, String grade, String address) {
		super();
		this.gender = gender;
		this.name = name;
		this.grade = grade;
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
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
		return "StudentsDTO [gender=" + gender + ", name=" + name + ", grade=" + grade + ", address=" + address + "]";
	}

}
