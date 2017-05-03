public class Bear implements Animal
{
	public int a;
	public int b;

	public Bear(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Bear";
	}
	public String speak()
	{
		return "RAWRRR";
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