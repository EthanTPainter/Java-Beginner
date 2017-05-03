public class bunny implements Animal
{
	public int a;
	public int b;

	public bunny(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "bunny";
	}
	public String speak()
	{
		return "hehe";
	}
	public int getPoints()
	{
		return a;
	}
	public int getAnimalNum()
	{
		return b;
	}
}