public class turtle implements Animal
{
	public int a;
	public int b;

	public turtle(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Turtle";
	}
	public String speak()
	{
		return "huh";
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