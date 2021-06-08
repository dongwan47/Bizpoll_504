package space;

public class MVCSpringDTO {

	private String jo;
	private String lee;
	private String lim;
	private String choi;
	private String jung;

	public MVCSpringDTO() {
		// TODO Auto-generated constructor stub
	}

	public MVCSpringDTO(String jo, String lee, String lim, String choi, String jung) {
		super();
		this.jo = jo;
		this.lee = lee;
		this.lim = lim;
		this.choi = choi;
		this.jung = jung;
	}

	public String getJo() {
		return jo;
	}

	public void setJo(String jo) {
		this.jo = jo;
	}

	public String getLee() {
		return lee;
	}

	public void setLee(String lee) {
		this.lee = lee;
	}

	public String getLim() {
		return lim;
	}

	public void setLim(String lim) {
		this.lim = lim;
	}

	public String getChoi() {
		return choi;
	}

	public void setChoi(String choi) {
		this.choi = choi;
	}

	public String getJung() {
		return jung;
	}

	public void setJung(String jung) {
		this.jung = jung;
	}

	@Override
	public String toString() {
		return "MVCSpringDTO [jo=" + jo + ", lee=" + lee + ", lim=" + lim + ", choi=" + choi + ", jung=" + jung + "]";
	}

}
