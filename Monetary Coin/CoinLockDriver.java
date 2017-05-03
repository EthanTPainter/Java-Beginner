import cs1.Keyboard;

public class CoinLockDriver
{
	public static void main(String[] args)
	{
		Coin myCoin = new Coin();
		Coin myCoin2 = new Coin();

		System.out.println("#1");

		myCoin.setKey(15);
		myCoin.lock(10);
		myCoin.flip();
		System.out.println("\n\n");
		System.out.println(myCoin.toString());
		System.out.print("     " + myCoin.locked());

		System.out.println("\n\n\n#2");

		myCoin2.setKey(0);
		myCoin2.lock(0);
		myCoin2.flip();
		System.out.println("\n\n");
		System.out.println(myCoin2.toString());
		System.out.print("     " + myCoin2.locked());

		System.out.println("\n\n\n#3");

		myCoin2.unlock(6);
		myCoin2.flip();
		System.out.println("\n\n");
		System.out.println(myCoin.toString());
		System.out.println("     " + myCoin.locked());

/*		1) make a coin, set a key, try to lock with the wrong key, try to flip the coin
		result : a flip should happen, because coin was NOT correctly locked

		2)make a coin, set a key, try to lock with the correct key, try to flip the coin
		result : a flip should not happen, because coin WAS correctly locked

		3) try to unlock the coin from 2 with wrong key, then try to flip,
		result: a flip should not happen because wrong key was used with unlock*/
	}
}

