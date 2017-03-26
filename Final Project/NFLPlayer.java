package final_project;

public class NFLPlayer {

		public static void main(String[] args) {
			/* Fully implement a class, making use of at least two variable types to define
			   its properties
			 * Create the NFLPlayer class and add its properties
			 * Include player statistics found on the NFL website
			 * Use the variable types learned so far to create the player properties */
		
			long passingYards = 0;
			long rushingYards = 0;
			long receivingYards = 0;
			int tackles = 0;
			int sacks = 0;
			int interceptions = 0;
			int touchdowns = 0;
			String name;
			
			NFLPlayer() {
				
			}
			
			NFLPlayer(long newPassingYards, long newRushingYards, long newReceivingYards,
				int newTackles, int newSacks, int newInterceptions, int newTouchdowns) {
				passingYards = newPassingYards;
				rushingYards = newRushingYards;
				receivingYards = newReceivingYards;
				tackles = newTackles;
				sacks = newSacks;
				interceptions = newInterceptions;
				touchdowns = newTouchdowns;
			}
	
		}

	}

