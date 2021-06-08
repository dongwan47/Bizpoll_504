package school;

public class CarNumber {

	public static void main(String[] args) {

		CarNumberDTO caDto = new CarNumberDTO();
		caDto.setKorCar(1);
		caDto.setEngCar(2);
		caDto.setHisCar(3);
		caDto.setMatCar(4);
		caDto.setMusCar(5);

		CarNumberDAO caDao = new CarNumberDAO();

		caDao.carNumberInfo(caDto);

	}
}
