package school;

public class ChairDTO {

	private int ChairWidth;
	private int chairLength;
	private int chairheight;
	private String chairColor;

	public int getChairWidth() {
		return ChairWidth;
	}

	public void setChairWidth(int chairWidth) {
		ChairWidth = chairWidth;
	}

	public int getChairLength() {
		return chairLength;
	}

	public void setChairLength(int chairLength) {
		this.chairLength = chairLength;
	}

	public int getChairheight() {
		return chairheight;
	}

	public void setChairheight(int chairheight) {
		this.chairheight = chairheight;
	}

	public String getChairColor() {
		return chairColor;
	}

	public void setChairColor(String chairColor) {
		this.chairColor = chairColor;
	}

	@Override
	public String toString() {
		return "ChairDTO [ChairWidth=" + ChairWidth + ", chairLength=" + chairLength + ", chairheight=" + chairheight
				+ ", chairColor=" + chairColor + "]";
	}

}
