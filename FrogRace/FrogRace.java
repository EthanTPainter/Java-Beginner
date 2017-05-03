import cs1.Keyboard;
public class FrogRace
{
	public static void main (String[] args)
	{
		boolean cheer, race = true;
		int curDis1 = 0, curDis2 = 0, totalDis1 = 0, totalDis2 = 0;
		String froggy, froggy2, spaces1, spaces2;
		char cheerPick = 'y';
		spaces1 = "";
		spaces2 = "";

		System.out.println("Please enter the name of the first frog: ");
		froggy = Keyboard.readString();
		System.out.println("Please enter the name of the second frog: ");
		froggy2 = Keyboard.readString();

		Frog frog1 = new Frog(froggy);
		System.out.println();
		Frog frog2 = new Frog(froggy2);

		System.out.println("The Statistics of " + frog1.getFrogName());
		System.out.println("Frog Strength: " + frog1.getFrogStrength());
		System.out.println("Frog Cheer Advantage: " + frog1.getFrogCheerAdvantage());
		System.out.println("\n------------------------\n");
		System.out.println("The Statisitcs of " + frog2.getFrogName());
		System.out.println("Frog Strength: " + frog2.getFrogStrength());
		System.out.println("Frog Cheer Advantage: " + frog2.getFrogCheerAdvantage());
		System.out.println("\n");

		System.out.println("  @..@");
        System.out.println(" (----)");
        System.out.println("( >__< )");
        System.out.println("^^ ~~ ^^");
		System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("  @..@");
		System.out.println(" (----)");
		System.out.println("( >__< )");
        System.out.println("^^ ~~ ^^");

        System.out.println("\n");

		while(race == true)
		{
			System.out.println("\nDo you want to cheer for " + frog1.getFrogName() + "? If so, enter y.");
			cheerPick = Keyboard.readChar();

			if(cheerPick == 'y')
			{
				cheer = true;
			}
			else
			{
				cheer = false;
			}
			curDis1 = frog1.jump(cheer);

			System.out.println("Do you want to cheer for " + frog2.getFrogName() +"? If so, enter y.");
			cheerPick = Keyboard.readChar();

			if(cheerPick == 'y')
			{
				cheer = true;
			}
			else
			{
				cheer = false;
			}

			curDis2 = frog2.jump(cheer);

			for(int i=0; i < curDis1; i++)
			{
				spaces1 += " ";
			}
			for(int a=0; a < curDis2; a++)
			{
				spaces2 += " ";
			}

			totalDis1 += curDis1;
			totalDis2 += curDis2;

			System.out.println();
			System.out.println(spaces1 + "  @..@");
			System.out.println(spaces1 + " (----)");
			System.out.println(spaces1 + "( >__< )");
			System.out.println(spaces1 + "^^ ~~ ^^");
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------\n");
			System.out.println(spaces2 + "  @..@");
			System.out.println(spaces2 + " (----)");
			System.out.println(spaces2 + "( >__< )");
			System.out.println(spaces2 + "^^ ~~ ^^");

			System.out.println("\n\n" + frog1.getFrogName() +" Statistics");
			System.out.println("Distance Jumped: " + frog1.getFrogStrength());
			System.out.println("Total Distance: " + totalDis1);

			System.out.println();

			System.out.println(frog2.getFrogName() + " Statistics");
			System.out.println("Distance Jumped: " + frog2.getFrogStrength());
			System.out.println("Total Distance: " + totalDis2);

			if(totalDis2 >= 125)
			{
				System.out.println("\nCongratualations " + frog1.getFrogName());
				race = false;
			}
			else if(totalDis1 >= 125)
			{
				System.out.println("\nCongratualations " + frog2.getFrogName());
				race = false;
			}
		}
		System.out.println("\nThanks for Playing!");
	}
}