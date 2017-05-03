public class Iguana implements Animal
{
	public int a;
	public int b;

	public Iguana(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Iguana";
	}
	public String speak()
	{
		return "shhhh";
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