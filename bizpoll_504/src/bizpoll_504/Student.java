package bizpoll_504;

public class Student {
	String name;
	int number;
	String gender;

	public Student(String n, int num, String g) {
		name = n;
		number = num;
		gender = g;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
