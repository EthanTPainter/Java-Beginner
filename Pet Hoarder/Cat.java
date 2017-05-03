public class Cat extends Pet
{
	private String e;

	public Cat(String n)
	{
		super(n);
	}
	public String toString()
	{
		return super.toString() + " is a cat";
	}
	public String speak()
	{
		return "meow";
	}
	public String move()
	{
		return "bounce";
	}
}