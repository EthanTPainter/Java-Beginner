public class MonetaryCoinDriver
{
	public static void main (String[] args)
	{
		MonetaryCoin[] coins = new MonetaryCoin[5];

		coins[0] = new MonetaryCoin(15);
		coins[1] = new MonetaryCoin(65);
		coins[2] = new MonetaryCoin(108);
		coins[3] = new MonetaryCoin(222);
		coins[4] = new MonetaryCoin(1);

		System.out.println("FACE    #  ");
		System.out.println();
		for(int flipping = 0; flipping < coins.length; flipping++)
		{
			coins[flipping].flip();
		}

		int sum = 0;
		for(int adding = 0; adding < coins.length; adding++)
		{
			sum+= coins[adding].getValue();
		}

		for(int index = 0; index < coins.length; index++)
		{
			System.out.println(coins[index]);
		}

		System.out.println("\nSum of Coins: " + sum);
	}
}