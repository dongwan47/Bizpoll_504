package bizpoll_504;

import java.util.ArrayList;

public class morning {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("호랑이", 2009038033, "남"));
		students.add(new Student("고양이", 2007012034, "여"));

		System.out.println("첫 번째~ 세 번째 문제");
		for (Student item : students) {
			System.out.println(String.format("이름:%s, 학번:%d, 성별:%s", item.name, item.number, item.gender));
		}
		System.out.println();

		System.out.println("학번 바꾸기, 이름 바꾸기, 성별 바꾸기");
		System.out.println();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).name == "호랑이") {
				students.get(i).setNumber(2019038033);
			}
			if (students.get(i).name == "고양이") {
				students.get(i).setName("kobalja");
				students.get(i).setGender("남");

			}
		}
		System.out.println("네 번째~다섯 번째 문제");
		for (Student item : students) {
			System.out.println(String.format("이름:%s, 학번:%d, 성별:%s", item.name, item.number, item.gender));

		}
	}
}