package genesis;

public class GenesisDTO {

	private String sky;
	private String land;
	private String sea;
	private String wind;
	private String love;

	public GenesisDTO() {
		// TODO Auto-generated constructor stub
	}

	public GenesisDTO(String sky, String land, String sea, String wind, String love) {
		super();
		this.sky = sky;
		this.land = land;
		this.sea = sea;
		this.wind = wind;
		this.love = love;
	}

	public String getSky() {
		return sky;
	}

	public void setSky(String sky) {
		this.sky = sky;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getSea() {
		return sea;
	}

	public void setSea(String sea) {
		this.sea = sea;
	}

	public String getWind() {
		return wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}

	@Override
	public String toString() {
		return "GenesisDTO [sky=" + sky + ", land=" + land + ", sea=" + sea + ", wind=" + wind + ", love=" + love + "]";
	}

}
