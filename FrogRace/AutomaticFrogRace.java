import cs1.Keyboard;
public class AutomaticFrogRace
{
	public static void main (String[] args) throws InterruptedException
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

		while(race == true)
		{
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e){
			}

			curDis1 = frog1.jump(cheer);
			curDis2 = frog2.jump(cheer);
			totalDis1 += curDis1;
			totalDis2 += curDis2;
			for(int i=0; i < curDis1; i++)
			{
				spaces1 += " ";
			}
			for(int a=0; a < curDis2; a++)
			{
				spaces2 += " ";
			}

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

			if(totalDis1 >= 125)
			{
				for(int i=1;i<70; i++)
				{
					System.out.println();
				}
				System.out.println("\n\n" + frog1.getFrogName() +" Statistics");
				System.out.println("Distance Jumped: " + frog1.getFrogStrength());
				System.out.println("Max Cheer Advantage: " + frog1.getFrogCheerAdvantage());
				System.out.println("Total Distance: " + totalDis1);
				System.out.println("\n\n" + frog2.getFrogName() +" Statistics");
				System.out.println("Distance Jumped: " + frog2.getFrogStrength());
				System.out.println("Max Cheer Advantage: " + frog2.getFrogCheerAdvantage());
				System.out.println("Total Distance: " + totalDis2);
				System.out.println("\nCongrats " + frog1.getFrogName());
				System.out.println("\nHere is your prize: \n");
				System.out.println("        XMMMMMMMMMMMMMMMMMMMMMMMMX        ");
				System.out.println("        iXMMMMMMMMMMMMMMMMMMMMMMXi    ");
				System.out.println("   ,+iiiitMMMMMMMMMMMMMMMMMMMMMMYiiiii;:  ");
				System.out.println("  +BMMRBXVBMMMMMMMMMMMMMMMMMMMMMMBBVXBMMMV, ");
				System.out.println(" ;MV,      RMMMMMMMMMMMMMMMMMMMMR       ;BB. ");
				System.out.println(" XM:       YMMMMMMMMMMMMMMMMMMMMY        iMi  ");
				System.out.println(" MM        ;MMMMMMMMMMMMMMMMMMMMi        ;MY   ");
				System.out.println(" BM,     :YRMMMMMMMMMMMMMMMMMMMMMBi      iMi    ");
				System.out.println(" iMV    :RR+tMMMMMMMMMMMMMMMMMMt,tMV    .RR:  ");
				System.out.println("  XMi   :MB :RMMMMMMMMMMMMMMMMR: ,MB    YMi   ");
				System.out.println("  .VMi   tMY tMMMMMMMMMMMMMMMMt .XM;  :XMi   ");
				System.out.println("    YMB+  VMt.BMMMMMMMMMMMMMMB..XMi :iRRi    ");
				System.out.println("     ,VMRBXMR ;RMMMMMMMMMMMMR; ;MRXBMRi.    ");
				System.out.println("       :+iii,  ;RMMMMMMMMMMR;   ;iii;.      ");
				System.out.println("                ,XMMMMMMMMX,                ");
				System.out.println("                  ;tYMMYt;                  ");
				System.out.println("                    :MM:                    ");
				System.out.println("                    :MM:                    ");
				System.out.println("                    :MM:                    ");
				System.out.println("                    :MM:                    ");
				System.out.println("                .;iVRMMRVi;.                ");
				System.out.println("             :tXMMMMMMMMMMMMBt,             ");
				System.out.println("             ;MB,,,,,,,,,,,,tMi             ");
				System.out.println("             ;MX            iMi             ");
				System.out.println("             ;MX     1st    iMi             ");
				System.out.println("             ;MX            iMi             ");
				System.out.println("             ;MB,,,,,,,,,,,,tMi             ");
				System.out.println("             iMMMMMMMMMMMMMMMMY             ");
				System.out.println("           .YMMMMMMMMMMMMMMMMMMX:           ");
			    System.out.println("          ;XBBBBBBBBBBBBBBBBBBBBB;     ");
				race = false;
			}
			else if(totalDis2 >= 125)
			{
				for(int i=1;i<70; i++)
				{
					System.out.println();
				}
				System.out.println("\n\n" + frog1.getFrogName() +" Statistics");
				System.out.println("Distance Jumped: " + frog1.getFrogStrength());
				System.out.println("Max Cheer Advantage: " + frog1.getFrogCheerAdvantage());
				System.out.println("Total Distance: " + totalDis1);
				System.out.println("\n\n" + frog2.getFrogName() +" Statistics");
				System.out.println("Distance Jumped: " + frog2.getFrogStrength());
				System.out.println("Max Cheer Advantage: " + frog2.getFrogCheerAdvantage());
				System.out.println("Total Distance: " + totalDis2);
				System.out.println("\nCongrats " + frog2.getFrogName());
				System.out.println("\nHere is your prize: \n");
				System.out.println("        XMMMMMMMMMMMMMMMMMMMMMMMMX        ");
				System.out.println("        iXMMMMMMMMMMMMMMMMMMMMMMXi    ");
				System.out.println("   ,+iiiitMMMMMMMMMMMMMMMMMMMMMMYiiiii;:  ");
				System.out.println("  +BMMRBXVBMMMMMMMMMMMMMMMMMMMMMMBBVXBMMMV, ");
				System.out.println(" ;MV,      RMMMMMMMMMMMMMMMMMMMMR       ;BB. ");
				System.out.println(" XM:       YMMMMMMMMMMMMMMMMMMMMY        iMi  ");
				System.out.println(" MM        ;MMMMMMMMMMMMMMMMMMMMi        ;MY   ");
				System.out.println(" BM,     :YRMMMMMMMMMMMMMMMMMMMMMBi      iMi    ");
				System.out.println(" iMV    :RR+tMMMMMMMMMMMMMMMMMMt,tMV    .RR:  ");
				System.out.println("  XMi   :MB :RMMMMMMMMMMMMMMMMR: ,MB    YMi   ");
				System.out.println("  .VMi   tMY tMMMMMMMMMMMMMMMMt .XM;  :XMi   ");
				System.out.println("    YMB+  VMt.BMMMMMMMMMMMMMMB..XMi :iRRi    ");
				System.out.println("     ,VMRBXMR ;RMMMMMMMMMMMMR; ;MRXBMRi.    ");
				System.out.println("       :+iii,  ;RMMMMMMMMMMR;   ;iii;.      ");
				System.out.println("                ,XMMMMMMMMX,                ");
				System.out.println("                  ;tYMMYt;                  ");
				System.out.println("                    :MM:                    ");
				System.out.println("                    :MM:                    ");
				System.out.println("                    :MM:                    ");
				System.out.println("                    :MM:                    ");
				System.out.println("                .;iVRMMRVi;.                ");
				System.out.println("             :tXMMMMMMMMMMMMBt,             ");
				System.out.println("             ;MB,,,,,,,,,,,,tMi             ");
				System.out.println("             ;MX            iMi             ");
				System.out.println("             ;MX     1st    iMi             ");
				System.out.println("             ;MX            iMi             ");
				System.out.println("             ;MB,,,,,,,,,,,,tMi             ");
				System.out.println("             iMMMMMMMMMMMMMMMMY             ");
				System.out.println("           .YMMMMMMMMMMMMMMMMMMX:           ");
			    System.out.println("          ;XBBBBBBBBBBBBBBBBBBBBB;     ");
				race = false;
			}
		}
		System.out.println("\nThanks for Playing!");
	}
}