package school;

public class CarNumberDTO {

	private int korCar;
	private int engCar;
	private int hisCar;
	private int matCar;
	private int musCar;

	public int getKorCar() {
		return korCar;
	}

	public void setKorCar(int korCar) {
		this.korCar = korCar;
	}

	public int getEngCar() {
		return engCar;
	}

	public void setEngCar(int engCar) {
		this.engCar = engCar;
	}

	public int getHisCar() {
		return hisCar;
	}

	public void setHisCar(int hisCar) {
		this.hisCar = hisCar;
	}

	public int getMatCar() {
		return matCar;
	}

	public void setMatCar(int matCar) {
		this.matCar = matCar;
	}

	public int getMusCar() {
		return musCar;
	}

	public void setMusCar(int musCar) {
		this.musCar = musCar;
	}

	@Override
	public String toString() {
		return "CarNumberDTO [korCar=" + korCar + ", engCar=" + engCar + ", hisCar=" + hisCar + ", matCar=" + matCar
				+ ", musCar=" + musCar + "]";
	}

}
