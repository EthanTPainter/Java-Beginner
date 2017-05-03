public class Players
{
	public static void main (String[] args)
	{
		BaseballStats player1;
		SoccerStats player2;

		player1 = new BaseballStats("Derek Jeter", "Pirates");
		player2 = new SoccerStats("Jason Johnson","Houston Dynamo");

		player1.score();
		player2.score();
		player1.getHit();
		player1.commitError();
		player2.takeShots(8);
		player2.gainGoals(3);

		System.out.println(player1);
		System.out.println("\n");
		System.out.println(player2);
	}
}
