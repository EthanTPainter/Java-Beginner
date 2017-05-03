import java.util.Random;
import cs1.Keyboard;
public class AnimalDriver
{
	public static void main (String[] args)
	{
		int winP = 55;
		int currP = 0;
		boolean gg = false;
		char go = 'y';

		Animal[] Animals = new Animal[12];

		Animals[0] = new Armadillo(6,1);
		Animals[1] = new Monkey(7,2);
		Animals[2] = new Sloth(23,3);
		Animals[3] = new Panda(-20,4);
		Animals[4] = new Bear(11,5);
		Animals[5] = new spider(-9,6);
		Animals[6] = new Kakapo(15,7);
		Animals[7] = new salamander(-10,8);
		Animals[8] = new bunny(13,9);
		Animals[9] = new Iguana(-6,10);
		Animals[10] = new turtle(3,11);
		Animals[11] = new scorpion(-8,12);

		Random generator = new Random();
		int roll = generator.nextInt(11)+0;

		System.out.println("Pull lever (y/n)?\n");
		go = Keyboard.readChar();

		if(go == 'y')
		{
			System.out.println("\nThe " + Animals[roll].getName() + " says " + Animals[roll].speak());
			System.out.println("Your Animal is a " + Animals[roll].getName());
			System.out.println("Animal Points: " + Animals[roll].getPoints() + " Points");
			System.out.println("Animal Number: " + Animals[roll].getAnimalNum());
			currP += Animals[roll].getPoints();
			System.out.println("\nTotal Points: " + currP);
			gg = false;
			go = 'y';
		}
		while(gg == false && currP < winP && go == 'y')
		{
			System.out.println("\nPull the lever (y/n)?\n");
			go = Keyboard.readChar();

			if(go == 'y')
			{
				roll = generator.nextInt(12)+0;
				System.out.println("\nThe " + Animals[roll].getName() + " says " + Animals[roll].speak());
				System.out.println("Your Animal is a " + Animals[roll].getName());
				System.out.println("Animal Points: " + Animals[roll].getPoints() + " Points");
				System.out.println("Animal Number: " + Animals[roll].getAnimalNum());
				currP += Animals[roll].getPoints();
				System.out.println("\nTotal Points: " + currP);

				if(currP >= 55)
				{
					System.out.println("Congrats! You won!");
					gg = true;
					go = 'n';
				}
			}
			if(go != 'y')
			{
				System.out.println("\nThanks for playing!");
			}
		}
	}
}