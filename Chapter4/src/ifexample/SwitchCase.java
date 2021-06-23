package ifexample;

public class SwitchCase {
	public static void main(String[] args) {
		int age = 7;
		int charge;

		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		} else if (age < 60) {
			charge = 3000;
			System.out.println("일반인입니다.");
		} else {
			charge = 0;
			System.out.println("경로우대입니다.");
		}
		System.out.println("입장료는 " + charge + "원입니다.");
		System.out.println("--------------------------------");

		int score = 87;
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(score + "점은 " + grade + "학점입니다.");
		System.out.println("--------------------------------");

		int ranking = 1;
		char medalcolor;

		switch (ranking) {
		case 1:
			medalcolor = 'G';
			break;
		case 2:
			medalcolor = 'S';
			break;
		case 3:
			medalcolor = 'B';
			break;

		default:
			medalcolor = 'A';
			break;
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalcolor + "입니다");
		System.out.println("--------------------------------");

		int month = 2;
		int day = 0;
		
		switch (month) {
		case 1 : case 3 :case 5 :case 7 :case 8 :case 10 :case 12 : day = 31;
			break;
		case 4 : case 6 :case 9 :case 11 : day = 30;
			break;
		case 2 :
			day = 28;
			break;
		}
		System.out.println(month + "월의 날짜는 " + day + "까지입니다.");
	}

}
