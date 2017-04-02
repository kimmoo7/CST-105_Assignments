package final_project;

public class OffensivePlayer extends NFLPlayer {
	
	private long passingYards;
	private long rushingYards;
	private long receivingYards;	
	private int touchdowns;
	
	OffensivePlayer(String name, long passingYards, long rushingYards, long receivingYards,
		int touchdowns) {
			
		super(name);
		
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
}
