package bizpoll_504;

public class RoseDTO {

	private String name;
	private String color;
	private int numberOfLeaves;
	private int bloom;
	private int plantLength;

	public RoseDTO() {
		// TODO Auto-generated constructor stub
	}

	public RoseDTO(String name, String color, int numberOfLeaves, int bloom, int plantLength) {
		super();
		this.name = name;
		this.color = color;
		this.numberOfLeaves = numberOfLeaves;
		this.bloom = bloom;
		this.plantLength = plantLength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfLeaves() {
		return numberOfLeaves;
	}

	public void setNumberOfLeaves(int numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}

	public int getBloom() {
		return bloom;
	}

	public void setBloom(int bloom) {
		this.bloom = bloom;
	}

	public int getPlantLength() {
		return plantLength;
	}

	public void setPlantLength(int plantLength) {
		this.plantLength = plantLength;
	}

	@Override
	public String toString() {
		return "RoseDTO [name=" + name + ", color=" + color + ", numberOfLeaves=" + numberOfLeaves + ", bloom=" + bloom
				+ ", plantLength=" + plantLength + "]";
	}

}
