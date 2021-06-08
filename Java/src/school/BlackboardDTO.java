package school;

public class BlackboardDTO {

	private int blackBoardwidth;
	private int blackBoardLength;
	private int blackBoardheight;
	private String color;

	public int getBlackBoardwidth() {
		return blackBoardwidth;
	}

	public void setBlackBoardwidth(int blackBoardwidth) {
		this.blackBoardwidth = blackBoardwidth;
	}

	public int getBlackBoardLength() {
		return blackBoardLength;
	}

	public void setBlackBoardLength(int blackBoardLength) {
		this.blackBoardLength = blackBoardLength;
	}

	public int getBlackBoardheight() {
		return blackBoardheight;
	}

	public void setBlackBoardheight(int blackBoardheight) {
		this.blackBoardheight = blackBoardheight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "BlackboardDTO [blackBoardwidth=" + blackBoardwidth + ", blackBoardLength=" + blackBoardLength
				+ ", blackBoardheight=" + blackBoardheight + ", color=" + color + "]";
	}

}
