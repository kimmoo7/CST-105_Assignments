package final_project;

public class OffensivePlayer extends NFLPlayer implements Celebrator {
	
	private long passingYards;
	private long rushingYards;
	private long receivingYards;	
	private int touchdowns;
	
	OffensivePlayer(String team, String name, String position, long passingYards, 
						long rushingYards, long receivingYards, int touchdowns) {
			
		super(team, name, position);
		
		this.passingYards = passingYards;
		this.rushingYards = rushingYards;
		this.receivingYards = receivingYards;
		this.touchdowns = touchdowns;
	}
	
	public long getPassingYards() {
		return this.passingYards;
	}
	
	public long getRushingYards() {
		return this.rushingYards;
	}
	
	public long getReceivingYards() {
		return this.receivingYards;
	}
	
	public int getTouchdowns() {
		return this.touchdowns;
	}
	
	public void setPassingYards(long passingYards) {
		this.passingYards = passingYards;
	}
	
	public void setRushingYards(long rushingYards) {
		this.rushingYards = rushingYards;
	}
	
	public void setReceivingYards(long receivingYards) {
		this.receivingYards = receivingYards;
	}
	
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}
	
	public void celebrate() {
		String [] celebrations = {this.name + " eats a cake", 
		                          this.name + " dances ballet solo", 
		                          this.name + " sings \"All I do is Win\"", 
		                          this.name + " does awesome break dancing moves",
		                          this.name + " buys a monster slurpee"};
		int random = (int)(Math.random() * 5);
		System.out.println(celebrations[random] + " to celebrate his draft");
	}
	
}
