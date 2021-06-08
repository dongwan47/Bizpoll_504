package space;

public class ZodiacDTO {

	private String aquarius;
	private String pisces;
	private String aries;
	private String taurus;
	private String gemini;
	private String cancer;
	private String leo;
	private String virgo;
	private String libra;
	private String scorpio;
	private String sagittarius;
	private String capricorn;

	public ZodiacDTO() {
		// TODO Auto-generated constructor stub
	}

	public ZodiacDTO(String aquarius, String pisces, String aries, String taurus, String gemini, String cancer,
			String leo, String virgo, String libra, String scorpio, String sagittarius, String capricorn) {
		super();
		this.aquarius = aquarius;
		this.pisces = pisces;
		this.aries = aries;
		this.taurus = taurus;
		this.gemini = gemini;
		this.cancer = cancer;
		this.leo = leo;
		this.virgo = virgo;
		this.libra = libra;
		this.scorpio = scorpio;
		this.sagittarius = sagittarius;
		this.capricorn = capricorn;
	}

	public String getAquarius() {
		return aquarius;
	}

	public void setAquarius(String aquarius) {
		this.aquarius = aquarius;
	}

	public String getPisces() {
		return pisces;
	}

	public void setPisces(String pisces) {
		this.pisces = pisces;
	}

	public String getAries() {
		return aries;
	}

	public void setAries(String aries) {
		this.aries = aries;
	}

	public String getTaurus() {
		return taurus;
	}

	public void setTaurus(String taurus) {
		this.taurus = taurus;
	}

	public String getGemini() {
		return gemini;
	}

	public void setGemini(String gemini) {
		this.gemini = gemini;
	}

	public String getCancer() {
		return cancer;
	}

	public void setCancer(String cancer) {
		this.cancer = cancer;
	}

	public String getLeo() {
		return leo;
	}

	public void setLeo(String leo) {
		this.leo = leo;
	}

	public String getVirgo() {
		return virgo;
	}

	public void setVirgo(String virgo) {
		this.virgo = virgo;
	}

	public String getLibra() {
		return libra;
	}

	public void setLibra(String libra) {
		this.libra = libra;
	}

	public String getScorpio() {
		return scorpio;
	}

	public void setScorpio(String scorpio) {
		this.scorpio = scorpio;
	}

	public String getSagittarius() {
		return sagittarius;
	}

	public void setSagittarius(String sagittarius) {
		this.sagittarius = sagittarius;
	}

	public String getCapricorn() {
		return capricorn;
	}

	public void setCapricorn(String capricorn) {
		this.capricorn = capricorn;
	}

	@Override
	public String toString() {
		return "ZodiacDTO [aquarius=" + aquarius + ", pisces=" + pisces + ", aries=" + aries + ", taurus=" + taurus
				+ ", gemini=" + gemini + ", cancer=" + cancer + ", leo=" + leo + ", virgo=" + virgo + ", libra=" + libra
				+ ", scorpio=" + scorpio + ", sagittarius=" + sagittarius + ", capricorn=" + capricorn + "]";
	}

}
