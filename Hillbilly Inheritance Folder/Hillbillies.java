public class Hillbillies
{
	public static void main (String[] args)
	{
		Hillbilly choose;

		choose = new BobbiJo("Bobbi Jo",6);

		System.out.println(choose);
		System.out.println(choose.getName() + "'s favorite activity is " + choose.favAct());
		System.out.println(choose.getName() + "'s favorite sporting event is the " + choose.favSportE());
		System.out.println(choose.getName() + "'s favorite beverage is " + choose.favBev());
		System.out.println(choose.getName() + " has an " + choose.accent() + " accent.");
		System.out.println();

		choose = new CletusFern("Cletus Fern",6);

		System.out.println(choose);
		System.out.println(choose.getName() + "'s favorite activity is " + choose.favAct());
		System.out.println(choose.getName() + "'s favorite sporting event is " + choose.favSportE());
		System.out.println(choose.getName() + "'s favorite beverage is " + choose.favBev());
		System.out.println(choose.getName() + " has an " + choose.accent() + " accent.");
		System.out.println();

		choose = new OutcastOllie("\"Outcast\" Ollie",7);

		System.out.println(choose);
		System.out.println(choose.getName() + "'s favorite activity is " + choose.favAct());
		System.out.println(choose.getName() + "'s favorite sporting event is " + choose.favSportE());
		System.out.println(choose.getName() + "'s favorite beverage is " + choose.favBev());
		System.out.println(choose.getName() + " has a " + choose.accent() + " accent.");
	}
}
