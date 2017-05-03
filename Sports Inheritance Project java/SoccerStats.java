public class SoccerStats extends PlayerStats
{
	protected int goals;
	protected int shots;

	public SoccerStats (String player, String team)
	{
		super (player, team);
		shots = 0;
		goals = 0;
	}

	public void score()
	{
		score += 5;
	}

	public void takeShots(int numShots)
	{
		shots += numShots;
	}

	public int Shots()
	{
		return shots;
	}

	public void gainGoals(int numGoals)
	{
		goals += numGoals;
	}

	public int getGoals()
	{
		return goals;
	}

	public String toString()
	{
		String result = super.toString();
		result += "\nShots on Goal: " + shots;
		result += "\nGoals: " + shots;
		return result;
	}
}
