
public class Game {
	
	private String name;
	private int gameId;
	private double price;
	
	
	public Game() {
		
	}


	public Game(String name, int gameId, double price) {
		super();
		this.name = name;
		this.gameId = gameId;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGameId() {
		return gameId;
	}


	public void setGameId(int gameId) {
		this.gameId = gameId;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
