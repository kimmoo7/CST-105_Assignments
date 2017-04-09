package final_project;

public class NFLPlayer implements Celebrator {
	/* Fully implement a class, making use of at least two variable types to define
	   its properties
	 * Create the NFLPlayer class and add its properties
	 * Include player statistics found on the NFL website
	 * Use the variable types learned so far to create the player properties */
	/* Getter and setter instructions:
	   Students will implement getters and setters for the properties contained in the player class. Any calculation needed for a specific property will be implemented inside the getter (for example, properties that return the “average” or “percentage”).
	   Create getters and setters for the properties contained in the player class */

	protected String name;
	String team;
	String position;

	
	NFLPlayer(String team, String name, String position) {
		this.name = name;
		this.team = team;
		this.position = position;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTeam() {
		return this.team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void setPosition(String position) {
		this.position = position;
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

