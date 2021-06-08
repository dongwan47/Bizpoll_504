package color;

public class ColorDTO {

	private String red;
	private String orange;
	private String yellow;
	private String green;
	private String blue;
	private String navy;
	private String pupple;
	
	public ColorDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ColorDTO(String red, String orange, String yellow, String green, String blue, String navy, String pupple) {
		super();
		this.red = red;
		this.orange = orange;
		this.yellow = yellow;
		this.green = green;
		this.blue = blue;
		this.navy = navy;
		this.pupple = pupple;
	}



	public String getRed() {
		return red;
	}

	public void setRed(String red) {
		this.red = red;
	}

	public String getOrange() {
		return orange;
	}

	public void setOrange(String orange) {
		this.orange = orange;
	}

	public String getYellow() {
		return yellow;
	}

	public void setYellow(String yellow) {
		this.yellow = yellow;
	}

	public String getGreen() {
		return green;
	}

	public void setGreen(String green) {
		this.green = green;
	}

	public String getBlue() {
		return blue;
	}

	public void setBlue(String blue) {
		this.blue = blue;
	}

	public String getNavy() {
		return navy;
	}

	public void setNavy(String navy) {
		this.navy = navy;
	}

	public String getPupple() {
		return pupple;
	}

	public void setPupple(String pupple) {
		this.pupple = pupple;
	}

	@Override
	public String toString() {
		return "ColorDTO [red=" + red + ", orange=" + orange + ", yellow=" + yellow + ", green=" + green + ", blue="
				+ blue + ", navy=" + navy + ", pupple=" + pupple + "]";
	}

}
