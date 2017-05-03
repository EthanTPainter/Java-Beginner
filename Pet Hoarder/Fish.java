public class Fish extends Pet
{
	private String u;

	public Fish(String n)
	{
		super(n);
	}
	public String toString()
	{
		return super.toString() + " is a fish";
	}
	public String speak()
	{
		return "glub glub";
	}
	public String move()
	{
		return "swim";
	}
}