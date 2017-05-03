public class Froggy extends Pet
{
	public String s;

	public Froggy(String n)
	{
		super(n);
	}
	public String toString()
	{
		return super.toString() + " is a frog";
	}
	public String speak()
	{
		return "ribbet";
	}
	public String move()
	{
		return "hop";
	}
}