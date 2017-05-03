import cs1.Keyboard;
public class TicTacToeGame
{
	public static void main(String[] args)
	{
		boolean turn = true;
		boolean win = false;
		int playCount = 0;
		String player = new String();
		int x, y;

		char[][] table = new char[3][3];

		for(int row = 0; row < table.length; row++)
		{
			for(int col = 0; col < table.length; col++)
			{
				table[row][col] = '*';
			}
		}

		for(int row = 0; row < table.length; row++)
		{
			for(int col = 0; col < table.length; col++)
			{
				System.out.print(table[row][col] + "\t");
			}
			System.out.println("\n");
		}

		while(win == false)
		{
			while(playCount <= 8)
			{
				while(turn == true)
				{
					System.out.println("\n~~~~~~~~~~ PLAYER 1 ~~~~~~~~~~");
					System.out.println("\nEnter your x position (0 to 2): ");
					x = Keyboard.readInt();
					System.out.println("Enter your y position (0 to 2): ");
					y = Keyboard.readInt();
					System.out.println();

					if(table[y][x] != '*')
					{
						System.out.println("\nPlease enter a new num which has a open space (*): ");
						System.out.println("Enter your new x position (0 to 2): ");
						x = Keyboard.readInt();
						System.out.println("Enter your new y position (0 to 2): ");
						y = Keyboard.readInt();
						System.out.println();
					}

					else if(table[y][x] == '*')
					{
						table[y][x] = 'X';
						for(int row = 0; row < table.length; row++)
						{
							for(int col = 0; col < table.length; col++)
							{
								System.out.print(table[row][col] + "\t");
							}
							System.out.println("\n");
						}
					}

					turn = false;
					playCount++;

					if(table[0][0] == 'X' && table[0][1] == 'X' && table[0][2] == 'X' || table[0][0] == 'X' && table[1][1] == 'X' && table[2][2] == 'X' ||
					table[0][0] == 'X' && table[1][0] == 'X' && table[2][0] == 'X' || table[0][2] == 'X' && table[1][1] == 'X' && table[2][0] == 'X' ||
					table[1][0] == 'X' && table[1][1] == 'X' && table[1][2] == 'X' || table[2][0] == 'X' && table[2][1] == 'X' && table[2][2] == 'X' ||
					table[0][1] == 'X' && table[1][1] == 'X' && table[2][1] == 'X' || table[0][2] == 'X' && table[1][2] == 'X' && table[2][2] == 'X')
					{
						win = true;
						System.out.println("\n***************************************");
						System.out.println("Player 1 has won the Tic Tac Toe Game!");
						System.out.println("Player 2 must now bow down to Player 1.");
						System.out.println("***************************************");
					}
				}
			}

			while(playCount <= 8)
			{
				while(turn == false)
				{
					System.out.println("\n~~~~~~~~~~ PLAYER 2 ~~~~~~~~~~~");
					System.out.println("\nEnter your x position (0 to 2): ");
					x = Keyboard.readInt();
					System.out.println("Enter your y position (0 to 2): ");
					y = Keyboard.readInt();
					System.out.println();

					if(table[y][x] != '*')
					{
						System.out.println("\nPlease enter a new num which has a open space (*): ");
						System.out.println("Enter your new x position (0 to 2): ");
						x = Keyboard.readInt();
						System.out.println("Enter your new y position (0 to 2): ");
						y = Keyboard.readInt();
						System.out.println();
					}

					else if(table[y][x] == '*')
					{
						table[y][x] = 'O';
						for(int row = 0; row < table.length; row++)
						{
							for(int col = 0; col < table.length; col++)
							{
								System.out.print(table[row][col] + "\t");
							}
							System.out.println("\n");
						}
					}
					turn = true;
					playCount++;
				}
			}

			if(table[0][0] == 'O' && table[0][1] == 'O' && table[0][2] == 'O' || table[0][0] == 'O' && table[1][1] == 'O' && table[2][2] == 'O' ||
			table[0][0] == 'O' && table[1][0] == 'O' && table[2][0] == 'O' || table[0][2] == 'O' && table[1][1] == 'O' && table[2][0] == 'O' ||
			table[1][0] == 'O' && table[1][1] == 'O' && table[1][2] == 'O' || table[2][0] == 'O' && table[2][1] == 'O' && table[2][2] == 'O' ||
			table[0][1] == 'O' && table[1][1] == 'O' && table[2][1] == 'O' || table[0][2] == 'O' && table[1][2] == 'O' && table[2][2] == 'O')
			{
				win = true;
				System.out.println("\n**************************************");
				System.out.println("Player 2 has won the Tic Tac Toe Game!");
				System.out.println("Player 1 must now bow down to Player 2.");
				System.out.println("***************************************\n");
			}
		}

		if(win == true)
		{
			System.out.println("\t\tCONGRATULATIONS!!!!");
		}
		if(win == false)
		{
			System.out.println("\t\tThere was no winner.");
		}
	}
}