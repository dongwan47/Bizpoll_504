package operator;

public class OperationEx1 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 80;

		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore); // 160

		double avgScore = totalScore / 2.0;
		System.out.println(avgScore); // 80.0
	}
}
