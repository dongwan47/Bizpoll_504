package objects;

public class ObjectsDTO {

	private String cup;
	private String penCase;
	private String phone;
	private String book;
	private String shoose;
	private String pack;

	public ObjectsDTO() {
		// TODO Auto-generated constructor stub
	}

	public ObjectsDTO(String cup, String penCase, String phone, String book, String shoose, String pack) {
		super();
		this.cup = cup;
		this.penCase = penCase;
		this.phone = phone;
		this.book = book;
		this.shoose = shoose;
		this.pack = pack;
	}

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}

	public String getPenCase() {
		return penCase;
	}

	public void setPenCase(String penCase) {
		this.penCase = penCase;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getShoose() {
		return shoose;
	}

	public void setShoose(String shoose) {
		this.shoose = shoose;
	}

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	@Override
	public String toString() {
		return "ObjectsDTO [cup=" + cup + ", penCase=" + penCase + ", phone=" + phone + ", book=" + book + ", shoose="
				+ shoose + ", pack=" + pack + "]";
	}

}
