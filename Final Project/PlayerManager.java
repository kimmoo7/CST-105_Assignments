package final_project;

public class PlayerManager {

	public static void main(String[] args) {
		/* Create a class called PlayerManager.
  		 * The class should hold an array of players and have a class method called 
  		   CreatePlayers. This method will create the players that will be available 
  		   to be drafted and store them on the player’s array. */
	
	public ArrayList<NFLPlayer> PlayerList;
	
	public PlayerManager() {
		this.PlayerList = newArrayList<NFLPlayer>();
		this.createPlayers;
	}
	
	private void createPlayers() {
		for (int i = 0; i < 6; i++) {
			
			NFLPlayer newPlayer = new NFLPlayer ();
			
			String playerName = i + 1;
			
			this.PlayerList.add(newPlayer);
			
			
		}
	}
	
	}
	
}
	
	


