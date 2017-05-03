public class BobbiJo extends Hillbilly
{
	private int height;

	public BobbiJo(String hbN, int hBH)
	{
		super(hbN);
		height = hBH;
	}
	public String toString()
	{
		return super.toString() + " is the world champion for cow tipping, and is " + height + " feet tall.";
	}
	public String favAct()
	{
		return "lumberjacking";
	}
	public String favSportE()
	{
		return "State Pie Eating Championships";
	}
	public String favBev()
	{
		return "Moonshine";
	}
	public String accent()
	{
		return "American";
	}
}