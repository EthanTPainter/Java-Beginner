public class Snake extends Pet
{
	private String name;

	public Snake(String n)
	{
		super(n);
	}
	public String toString()
	{
		return super.toString() + " is a snake";
	}
	public String speak()
	{
		return "hiss";
	}
	public String move()
	{
		return "slither";
	}
}