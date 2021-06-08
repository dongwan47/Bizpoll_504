package flower;

public class FlowerDTO {

	private String rose;
	private String gypsophila;
	private String tulip;
	private String violet;

	public FlowerDTO() {
		// TODO Auto-generated constructor stub
	}

	public FlowerDTO(String rose, String gypsophila, String tulip, String violet) {
		super();
		this.rose = rose;
		this.gypsophila = gypsophila;
		this.tulip = tulip;
		this.violet = violet;
	}

	public String getRose() {
		return rose;
	}

	public void setRose(String rose) {
		this.rose = rose;
	}

	public String getGypsophila() {
		return gypsophila;
	}

	public void setGypsophila(String gypsophila) {
		this.gypsophila = gypsophila;
	}

	public String getTulip() {
		return tulip;
	}

	public void setTulip(String tulip) {
		this.tulip = tulip;
	}

	public String getViolet() {
		return violet;
	}

	public void setViolet(String violet) {
		this.violet = violet;
	}

	@Override
	public String toString() {
		return "FlowerDTO [rose=" + rose + ", gypsophila=" + gypsophila + ", tulip=" + tulip + ", violet=" + violet
				+ "]";
	}

}
