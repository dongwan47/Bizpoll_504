package school;

public class DescDTO {

	private int descWidth;
	private int descLength;
	private int descHeight;
	private String descColor;

	public int getDescWidth() {
		return descWidth;
	}

	public void setDescWidth(int descWidth) {
		this.descWidth = descWidth;
	}

	public int getDescLength() {
		return descLength;
	}

	public void setDescLength(int descLength) {
		this.descLength = descLength;
	}

	public int getDescHeight() {
		return descHeight;
	}

	public void setDescHeight(int descHeight) {
		this.descHeight = descHeight;
	}

	public String getDescColor() {
		return descColor;
	}

	public void setDescColor(String descColor) {
		this.descColor = descColor;
	}

	@Override
	public String toString() {
		return "DescDTO [descWidth=" + descWidth + ", descLength=" + descLength + ", descHeight=" + descHeight
				+ ", descColor=" + descColor + "]";
	}

}
