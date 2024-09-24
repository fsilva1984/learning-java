package streamAPI.consumer.exampleConsumer;

public class User {
	private String name;
	private int score;
	private boolean moderate = false;
	public User(String name, int score, boolean moderate) {
		super();
		this.name = name;
		this.score = score;
		this.moderate = moderate;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public boolean isModerate() {
		return moderate;
	}
	@Override
	public String toString() {
		return "User [ name:" + name + ", score: " + score + ", moderate: " + moderate + "]";
	}
	
	
}
