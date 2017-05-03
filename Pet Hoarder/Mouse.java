public class Mouse extends Pet
{
	private String s;

	public Mouse(String n)
	{
		super(n);
	}
	public String toString()
	{
		return super.toString() + " is a mouse";
	}
	public String speak()
	{
		return "squeak";
	}
	public String move()
	{
		return "squibble";
	}
}