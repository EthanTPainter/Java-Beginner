public class Armadillo implements Animal
{
	public int a;
	public int b;

	public Armadillo(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Armadillo";
	}
	public String speak()
	{
		return "huhya";
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