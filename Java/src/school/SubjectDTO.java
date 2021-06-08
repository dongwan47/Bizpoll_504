package school;

public class SubjectDTO {

	private String korean;
	private String math;
	private String music;
	private String history;
	private String english;
	
	public SubjectDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	
	@Override
	public String toString() {
		return "SubjectDTO [korean=" + korean + ", math=" + math + ", music=" + music + ", history=" + history
				+ ", english=" + english + "]";
	}
	
	
	
}
