package bizpoll_504;

import java.util.List;

public class StudentDAO {
	public void studentInfo(List<StudentDTO> studentList) {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getGender());
			System.out.println(studentList.get(i).getName());
			System.out.println(studentList.get(i).getId());
			System.out.println(studentList.get(i).getClassroom());
			System.out.println(studentList.get(i).getAddress());
		}
	}
}
