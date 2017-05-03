abstract public class Pet
{
	public String name;
	public int len;

	public Pet(String n)
	{
		name = n;
	}
	public String toString()
	{
		return "pet " + name;
	}
	abstract public String speak();

	abstract public String move();
}