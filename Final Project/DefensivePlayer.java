package final_project;

public class DefensivePlayer extends NFLPlayer implements Celebrator {

	private int tackles;
	private int sacks;
	private int interceptions;
	
	DefensivePlayer(String team, String name, 
			String position, int tackles, int sacks, int interceptions) {
			
		super(team, name, position);
		
		this.tackles = tackles;
		this.sacks = sacks;
		this.interceptions = interceptions;
	}
	
	public int getTackles() {
		return this.tackles;
	}
	
	public int getSacks() {
		return this.sacks;
	}
	
	public int getInterceptions() {
		return this.interceptions;
	}
	
	
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	
	public void setSacks(int sacks) {
		this.sacks = sacks;
	}
	
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}
	
	public void celebrate() {
		String [] celebrations = {this.name + " eats a cake", 
		                          this.name + " dances ballet solo", 
		                          this.name + " sings \"All I do is Win\"", 
		                          this.name + " does awesome break dancing moves",
		                          this.name + " buys a monster slurpee"};
		int random = (int) (Math.random() * 5);
		System.out.println(celebrations[random] + " to celebrate his draft");
	}
	
}
