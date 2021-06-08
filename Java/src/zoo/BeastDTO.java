package zoo;

public class BeastDTO {

	private String tiger;
	private String lion;
	private String panda;
	private String monkey;
	private String snake;
	private String liger;

	public BeastDTO() {
		// TODO Auto-generated constructor stub
	}

	public BeastDTO(String tiger, String lion, String panda, String monkey, String snake, String liger) {
		super();
		this.tiger = tiger;
		this.lion = lion;
		this.panda = panda;
		this.monkey = monkey;
		this.snake = snake;
		this.liger = liger;
	}

	public String getTiger() {
		return tiger;
	}

	public void setTiger(String tiger) {
		this.tiger = tiger;
	}

	public String getLion() {
		return lion;
	}

	public void setLion(String lion) {
		this.lion = lion;
	}

	public String getPanda() {
		return panda;
	}

	public void setPanda(String panda) {
		this.panda = panda;
	}

	public String getMonkey() {
		return monkey;
	}

	public void setMonkey(String monkey) {
		this.monkey = monkey;
	}

	public String getSnake() {
		return snake;
	}

	public void setSnake(String snake) {
		this.snake = snake;
	}

	public String getLiger() {
		return liger;
	}

	public void setLiger(String liger) {
		this.liger = liger;
	}

	@Override
	public String toString() {
		return "beast [tiger=" + tiger + ", lion=" + lion + ", panda=" + panda + ", monkey=" + monkey + ", snake="
				+ snake + ", liger=" + liger + "]";
	}
}
