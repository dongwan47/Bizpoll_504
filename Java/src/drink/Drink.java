package drink;

public class Drink {

	public static void main(String[] args) {

		DrinkDTO driDto = new DrinkDTO();
		driDto.setCoffee("커피");
		driDto.setCocaCola("코카콜라");
		driDto.setCilsungCider("칠성사이다");
		driDto.setFanta("환타");
		driDto.setGreenTea("녹차");

		DrinkDAO driDao = new DrinkDAO();

		driDao.drinkInfo(driDto);
	}
}
