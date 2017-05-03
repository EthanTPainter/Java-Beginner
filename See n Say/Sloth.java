public class Sloth implements Animal
{
	public int a;
	public int b;

	public Sloth(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Sloth";
	}
	public String speak()
	{
		return "zzzzzz";
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