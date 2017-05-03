public class spider implements Animal
{
	public int a;
	public int b;

	public spider(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Spider";
	}
	public String speak()
	{
		return "spasss";
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