package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] studentIDs = new int[10]; // int형 요소가 10개인 배열 선언

		int[] studentIDss = new int[] { 102, 102, 103 }; // []안에 개수는 생략함 {} 으로 값초기화
		
		int[] studentIDsss = {120, 130, 140}; // 선언과 동시에 값초기화시 new int[]를 생략해도 됨

		System.out.println(studentIDss);
	}
}
