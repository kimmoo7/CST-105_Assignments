
public class AssignmentOneEleven {

	public static void main(String[] args) {
		System.out.println("Starting population:");
			System.out.println("312,032,486");
		System.out.println("Population year 1:");
			System.out.println(312032486 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45));
			//calculates new population; 31536000 is the number of seconds per year
		System.out.println("Population year 2:");
			System.out.println(314812582 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45));
			//uses the population from year 1 to calculate population for year 2
		System.out.println("population year 3:");
			System.out.println(317592678 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45));
		System.out.println("population year 4:");
			System.out.println(320372774 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45));
		System.out.println("population year 5:");
			System.out.println(323152870 + (31536000 / 7) - (31536000 / 13) + (31536000 / 45));

	}

}
