package space;

public class SolarSystemDTO {

	private String sun;
	private String mercury;
	private String venus;
	private String earth;
	private String mars;
	private String jupiter;
	private String saturn;
	private String uranus;
	private String naptune;
	private String pluto;

	
	public SolarSystemDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SolarSystemDTO(String sun, String mercury, String venus, String earth, String mars, String jupiter,
			String saturn, String uranus, String naptune, String pluto) {
		super();
		this.sun = sun;
		this.mercury = mercury;
		this.venus = venus;
		this.earth = earth;
		this.mars = mars;
		this.jupiter = jupiter;
		this.saturn = saturn;
		this.uranus = uranus;
		this.naptune = naptune;
		this.pluto = pluto;
	}


	public String getSun() {
		return sun;
	}

	public void setSun(String sun) {
		this.sun = sun;
	}

	public String getMercury() {
		return mercury;
	}

	public void setMercury(String mercury) {
		this.mercury = mercury;
	}

	public String getVenus() {
		return venus;
	}

	public void setVenus(String venus) {
		this.venus = venus;
	}

	public String getEarth() {
		return earth;
	}

	public void setEarth(String earth) {
		this.earth = earth;
	}

	public String getMars() {
		return mars;
	}

	public void setMars(String mars) {
		this.mars = mars;
	}

	public String getJupiter() {
		return jupiter;
	}

	public void setJupiter(String jupiter) {
		this.jupiter = jupiter;
	}

	public String getSaturn() {
		return saturn;
	}

	public void setSaturn(String saturn) {
		this.saturn = saturn;
	}

	public String getUranus() {
		return uranus;
	}

	public void setUranus(String uranus) {
		this.uranus = uranus;
	}

	public String getNaptune() {
		return naptune;
	}

	public void setNaptune(String naptune) {
		this.naptune = naptune;
	}

	public String getPluto() {
		return pluto;
	}

	public void setPluto(String pluto) {
		this.pluto = pluto;
	}

	@Override
	public String toString() {
		return "SolarSystemDTO [sun=" + sun + ", mercury=" + mercury + ", venus=" + venus + ", earth=" + earth
				+ ", mars=" + mars + ", jupiter=" + jupiter + ", saturn=" + saturn + ", uranus=" + uranus + ", naptune="
				+ naptune + ", pluto=" + pluto + "]";
	}

}
