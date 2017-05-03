public class CletusFern extends Hillbilly
{
	private int height;

	public CletusFern(String hbName, int hbHeight)
	{
		super(hbName);
		height = hbHeight;
	}
	public String toString()
	{
		return super.toString() + " is a mud-wrastling hillbilly, clocking in at " + height + " feet tall.";
	}
	public String favAct()
	{
		return "Mud-wrastling with the piggies";
	}
	public String favSportE()
	{
		return "Dirt Bike Races";
	}
	public String favBev()
	{
		return "Budweiser";
	}
	public String accent()
	{
		return "American";
	}
}
