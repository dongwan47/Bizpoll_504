package flower;

public class GypsophilaDTO {

	private String name;
	private String color;
	private int plantLength;
	private int numberOfLeaves;
	private int bloom;

	public GypsophilaDTO() {
		// TODO Auto-generated constructor stub
	}

	public GypsophilaDTO(String name, String color, int plantLength, int numberOfLeaves, int bloom) {
		super();
		this.name = name;
		this.color = color;
		this.plantLength = plantLength;
		this.numberOfLeaves = numberOfLeaves;
		this.bloom = bloom;
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

	public int getPlantLength() {
		return plantLength;
	}

	public void setPlantLength(int plantLength) {
		this.plantLength = plantLength;
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

	@Override
	public String toString() {
		return "GypsophilaDTO [name=" + name + ", color=" + color + ", plantLength=" + plantLength + ", numberOfLeaves="
				+ numberOfLeaves + ", bloom=" + bloom + "]";
	}

}
