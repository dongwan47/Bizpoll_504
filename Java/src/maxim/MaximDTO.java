package maxim;

public class MaximDTO {

	private String origenal;
	private String moka;
	private String whiteGold;

	public MaximDTO() {
		// TODO Auto-generated constructor stub
	}

	public MaximDTO(String origenal, String moka, String whiteGold) {
		super();
		this.origenal = origenal;
		this.moka = moka;
		this.whiteGold = whiteGold;
	}

	public String getOrigenal() {
		return origenal;
	}

	public void setOrigenal(String origenal) {
		this.origenal = origenal;
	}

	public String getMoka() {
		return moka;
	}

	public void setMoka(String moka) {
		this.moka = moka;
	}

	public String getWhiteGold() {
		return whiteGold;
	}

	public void setWhiteGold(String whiteGold) {
		this.whiteGold = whiteGold;
	}

	@Override
	public String toString() {
		return "MaximDTO [origenal=" + origenal + ", moka=" + moka + ", whiteGold=" + whiteGold + "]";
	}

}
