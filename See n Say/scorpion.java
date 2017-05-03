public class scorpion implements Animal
{
	public int a;
	public int b;

	public scorpion(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Scorpion";
	}
	public String speak()
	{
		return "snak";
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