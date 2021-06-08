package school;

public class SculptureDTO {

	private String statue;
	private String tree;
	private String zeolite;
	private String playGround;
	private String pond;

	public String getStatue() {
		return statue;
	}

	public void setStatue(String statue) {
		this.statue = statue;
	}

	public String getTree() {
		return tree;
	}

	public void setTree(String tree) {
		this.tree = tree;
	}

	public String getZeolite() {
		return zeolite;
	}

	public void setZeolite(String zeolite) {
		this.zeolite = zeolite;
	}

	public String getPlayGround() {
		return playGround;
	}

	public void setPlayGround(String playGround) {
		this.playGround = playGround;
	}

	public String getPond() {
		return pond;
	}

	public void setPond(String pond) {
		this.pond = pond;
	}

	@Override
	public String toString() {
		return "SculptureDTO [statue=" + statue + ", tree=" + tree + ", zeolite=" + zeolite + ", playGround="
				+ playGround + ", pond=" + pond + "]";
	}

}
