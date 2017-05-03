import java.util.Random;
public class Frog
{
	int maxDoneJump;
	int maxCheerD;
	int fatigue;
	String name;
	int distance;
	Random generator = new Random();

	public Frog(String frogName)
	{
		name = frogName;
		maxDoneJump = generator.nextInt(6)+3;
		maxCheerD = generator.nextInt(5)+1;
		fatigue = generator.nextInt(2)+0;
		distance = 0;
	}

	public int getFrogStrength()
	{
		return maxDoneJump;
	}

	public int getFrogCheerAdvantage()
	{
		return maxCheerD;
	}

	public int getFrogFatigue()
	{
		return fatigue;
	}

	public int jump(boolean cheer)
	{
		int oJump = 0, tJump = 0;
		oJump = generator.nextInt(maxDoneJump);
		tJump = generator.nextInt(maxCheerD + 3 +1)-3;

		if(cheer == true)
		{
			return oJump + tJump - fatigue;
		}
		else
		{
			return oJump - fatigue;
		}
	}

	public int getJumpDistance()
	{
		return distance;
	}

	public String getFrogName()
	{
		return name;
	}

	public String toString()
	{
		return "Frog " + getFrogName();
	}
}
