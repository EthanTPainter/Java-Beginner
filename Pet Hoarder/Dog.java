public class Dog extends Pet
{
	private String f;

	public Dog(String n)
	{
		super(n);
	}
	public String toString()
	{
		return super.toString() + " is a dog ";
	}
	public String speak()
	{
		return "woof";
	}
	public String move()
	{
		return "runs";
	}
}