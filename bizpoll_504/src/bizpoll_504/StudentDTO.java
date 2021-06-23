package bizpoll_504;

public class StudentDTO {

	private String gender;
	private String name;
	private int id;
	private int classroom;
	private String address;

	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}

	public StudentDTO(String gender, String name, int id, int classroom, String address) {
		super();
		this.gender = gender;
		this.name = name;
		this.id = id;
		this.classroom = classroom;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDto [gender=" + gender + ", name=" + name + ", id=" + id + ", classroom=" + classroom
				+ ", address=" + address + "]";
	}

}
