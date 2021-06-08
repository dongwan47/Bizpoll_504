package keyboard;

public class KeyboardDTO {

	private String tab;
	private String shift;
	private String enter;

	public KeyboardDTO() {
		// TODO Auto-generated constructor stub
	}

	public KeyboardDTO(String tab, String shift, String enter) {
		super();
		this.tab = tab;
		this.shift = shift;
		this.enter = enter;
	}

	public String getTab() {
		return tab;
	}

	public void setTab(String tab) {
		this.tab = tab;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getEnter() {
		return enter;
	}

	public void setEnter(String enter) {
		this.enter = enter;
	}

	@Override
	public String toString() {
		return "KeyboardDTO [tab=" + tab + ", shift=" + shift + ", enter=" + enter + "]";
	}

}
