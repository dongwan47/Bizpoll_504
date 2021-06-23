package ifexample;

public class SwitchCase2 {
	public static void main(String[] args) {
		String medal = "Gold";

		switch (medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		System.out.println("--------------------");
		int buildingFloor = 5;

		switch (buildingFloor) {
		case 1:
			System.out.println("약국 입니다.");
			break;
		case 2:
			System.out.println("정형외과 입니다.");
			break;
		case 3:
			System.out.println("피부과 입니다.");
			break;
		case 4:
			System.out.println("치과 입니다.");
			break;
		default:
			System.out.println("헬스 클럽입니다.");
			break;
		}

	}
}
