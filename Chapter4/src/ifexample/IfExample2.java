package ifexample;

public class IfExample2 {
	public static void main(String[] args) {
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
	}
}
