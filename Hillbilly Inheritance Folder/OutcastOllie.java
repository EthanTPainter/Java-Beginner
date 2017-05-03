public class OutcastOllie extends Hillbilly
{
	private int height;

	public OutcastOllie(String hillbName, int hbHeight)
	{
		super(hillbName);
		height = hbHeight;
	}
	public String toString()
	{
		return super.toString() + " is the oucast of the hillbillies, and is " + height + " feet tall.";
	}
	public String favAct()
	{
		return "golfing with the coworkers";
	}
	public String favSportE()
	{
		return "The French Open";
	}
	public String favBev()
	{
		return "Crystal Clear Water";
	}
	public String accent()
	{
		return "British";
	}
}
