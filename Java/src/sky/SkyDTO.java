package sky;

public class SkyDTO {

	private String sun;
	private String cloud;

	public SkyDTO() {
		// TODO Auto-generated constructor stub
	}

	public SkyDTO(String sun, String cloud) {
		super();
		this.sun = sun;
		this.cloud = cloud;
	}

	public String getSun() {
		return sun;
	}

	public void setSun(String sun) {
		this.sun = sun;
	}

	public String getCloud() {
		return cloud;
	}

	public void setCloud(String cloud) {
		this.cloud = cloud;
	}

	@Override
	public String toString() {
		return "SkyDTO [sun=" + sun + ", cloud=" + cloud + "]";
	}

}
