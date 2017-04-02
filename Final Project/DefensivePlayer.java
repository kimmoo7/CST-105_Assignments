package final_project;

public class DefensivePlayer extends NFLPlayer {

	private int tackles;
	private int sacks;
	private int interceptions;
	
	DefensivePlayer(String name, int tackles, int sacks, int interceptions) {
			
		super(name);
		
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
	
}
