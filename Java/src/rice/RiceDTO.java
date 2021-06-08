package rice;

public class RiceDTO {

	private String white;
	private String yellow;
	private String black;

	public RiceDTO() {
		// TODO Auto-generated constructor stub
	}

	public RiceDTO(String white, String yellow, String black) {
		super();
		this.white = white;
		this.yellow = yellow;
		this.black = black;
	}

	public String getWhite() {
		return white;
	}

	public void setWhite(String white) {
		this.white = white;
	}

	public String getYellow() {
		return yellow;
	}

	public void setYellow(String yellow) {
		this.yellow = yellow;
	}

	public String getBlack() {
		return black;
	}

	public void setBlack(String black) {
		this.black = black;
	}

	@Override
	public String toString() {
		return "RiceDTO [white=" + white + ", yellow=" + yellow + ", black=" + black + "]";
	}

}
