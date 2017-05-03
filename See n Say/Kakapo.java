public class Kakapo implements Animal
{
	public int a;
	public int b;

	public Kakapo(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Kakapo";
	}
	public String speak()
	{
		return "kaw kaw";
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