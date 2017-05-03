public class Monkey implements Animal
{
	public int a;
	public int b;

	public Monkey(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Monkey";
	}
	public String speak()
	{
		return "Uhhh Ahhh";
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