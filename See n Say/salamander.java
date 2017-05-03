public class salamander implements Animal
{
	public int a;
	public int b;

	public salamander(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Salamander";
	}
	public String speak()
	{
		return "nuh nuh";
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