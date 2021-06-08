package classpart;

public class PracticeDTO {

	private String name;
	private String color;
	private String numberOfLeaves;
	private String bloom;
	private String plantLength;

	public PracticeDTO() {
		// TODO Auto-generated constructor stub
	}

	public PracticeDTO(String name, String color, String numberOfLeaves, String bloom, String plantLength) {
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

	public String getNumberOfLeaves() {
		return numberOfLeaves;
	}

	public void setNumberOfLeaves(String numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}

	public String getBloom() {
		return bloom;
	}

	public void setBloom(String bloom) {
		this.bloom = bloom;
	}

	public String getPlantLength() {
		return plantLength;
	}

	public void setPlantLength(String plantLength) {
		this.plantLength = plantLength;
	}

	@Override
	public String toString() {
		return "PracticeDTO [name=" + name + ", color=" + color + ", numberOfLeaves=" + numberOfLeaves + ", bloom="
				+ bloom + ", plantLength=" + plantLength + "]";
	}

}
