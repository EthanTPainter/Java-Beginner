import cs1.Keyboard;
import java.util.Random;
public class PetHoarder
{
	public static void main (String[] args)
	{
		char g = 'y';
		Pet[] myAnimals = new Pet[6];

		myAnimals[0] = new Dog("Gilbert");
		myAnimals[1] = new Cat("Missy");
		myAnimals[2] = new Fish("Dimetrius");
		myAnimals[3] = new Snake("Sharon");
		myAnimals[4] = new Froggy("Fred");
		myAnimals[5] = new Mouse("Mike");

		Random generator = new Random();

		System.out.println("Would you like to see a pet (y/n)?");
		g = Keyboard.readChar();

		if(g == 'y')
		{
			int rNum = generator.nextInt(6)+0;
			System.out.println("Identity: " + myAnimals[rNum].toString());
			System.out.println("Speaking: " + myAnimals[rNum].speak());
			System.out.println("Moving: " + myAnimals[rNum].move());
		}

		while(g == 'y')
		{
			System.out.println("Do you want to see another pet (y/n)?");
			g = Keyboard.readChar();

			if(g == 'y')
			{
				int aNum = generator.nextInt(5)+0;
				System.out.println("\nIdentity: " + myAnimals[aNum].toString());
				System.out.println("Speaking: " + myAnimals[aNum].speak());
				System.out.println("Moving: " + myAnimals[aNum].move());
			}
		}

		if(g != 'y')
		{
			System.out.println("Thanks for playing!");
		}
	}
}

