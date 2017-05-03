public abstract class Hillbilly
{
	private String name;

	public Hillbilly(String hbName)
	{
		name = hbName;
	}

	public String getName()
	{
		return name;
	}

	public String toString()
	{
		return "Hillbilly " + name;
	}

	abstract public String favAct();

	abstract public String favSportE();

	abstract public String favBev();

	abstract public String accent();
}
