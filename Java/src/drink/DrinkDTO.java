package drink;

public class DrinkDTO {

	private String coffee;
	private String cocaCola;
	private String cilsungCider;
	private String fanta;
	private String greenTea;

	public DrinkDTO() {
		// TODO Auto-generated constructor stub
	}

	public DrinkDTO(String coffee, String cocaCola, String cilsungCider, String fanta, String greenTea) {
		super();
		this.coffee = coffee;
		this.cocaCola = cocaCola;
		this.cilsungCider = cilsungCider;
		this.fanta = fanta;
		this.greenTea = greenTea;
	}

	public String getCoffee() {
		return coffee;
	}

	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}

	public String getCocaCola() {
		return cocaCola;
	}

	public void setCocaCola(String cocaCola) {
		this.cocaCola = cocaCola;
	}

	public String getCilsungCider() {
		return cilsungCider;
	}

	public void setCilsungCider(String cilsungCider) {
		this.cilsungCider = cilsungCider;
	}

	public String getFanta() {
		return fanta;
	}

	public void setFanta(String fanta) {
		this.fanta = fanta;
	}

	public String getGreenTea() {
		return greenTea;
	}

	public void setGreenTea(String greenTea) {
		this.greenTea = greenTea;
	}

	@Override
	public String toString() {
		return "DrinkDTO [coffee=" + coffee + ", cocaCola=" + cocaCola + ", cilsungCider=" + cilsungCider + ", fanta="
				+ fanta + ", greenTea=" + greenTea + "]";
	}

}
