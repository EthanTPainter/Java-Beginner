public class Panda implements Animal
{
	public int a;
	public int b;

	public Panda(int points, int aNum)
	{
		a = points;
		b = aNum;
	}
	public String getName()
	{
		return "Panda";
	}
	public String speak()
	{
		return "munch";
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