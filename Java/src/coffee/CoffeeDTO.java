package coffee;

public class CoffeeDTO {

	private String americano;
	private String cappuccino;
	private String cafeLatte;
	private String dutchCoffee;

	public CoffeeDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getAmericano() {
		return americano;
	}

	public CoffeeDTO(String americano, String cappuccino, String cafeLatte, String dutchCoffee) {
		super();
		this.americano = americano;
		this.cappuccino = cappuccino;
		this.cafeLatte = cafeLatte;
		this.dutchCoffee = dutchCoffee;
	}

	public void setAmericano(String americano) {
		this.americano = americano;
	}

	public String getCappuccino() {
		return cappuccino;
	}

	public void setCappuccino(String cappuccino) {
		this.cappuccino = cappuccino;
	}

	public String getCafeLatte() {
		return cafeLatte;
	}

	public void setCafeLatte(String cafeLatte) {
		this.cafeLatte = cafeLatte;
	}

	public String getDutchCoffee() {
		return dutchCoffee;
	}

	public void setDutchCoffee(String dutchCoffee) {
		this.dutchCoffee = dutchCoffee;
	}

	@Override
	public String toString() {
		return "CoffeeDTO [americano=" + americano + ", cappuccino=" + cappuccino + ", cafeLatte=" + cafeLatte
				+ ", dutchCoffee=" + dutchCoffee + "]";
	}

}
