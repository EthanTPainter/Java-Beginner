import cs1.Keyboard;
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListManager
{
	public static void main (String[] args)
	{
		ArrayList <String> stuff = new ArrayList <String>();

		stuff.add("Charles Pretty Boy Floyd");									//1
		stuff.add("Charlie Lucky Luciano");										//2
		stuff.add("Sam Golf Bag Hunt");											//3
		stuff.add("Israel Icepick Willie Alderman");							//4
		stuff.add("Vincent Mad Dog Coll");										//5
		stuff.add("Thomas Butterfingers Moran");								//6
		stuff.add("Lester Baby Face Nelson");									//7
		stuff.add("George Machine Gun Kelly");									//8
		stuff.add("Benjamin Bugsy Siegal");										//9
		stuff.add("Joe Peg Leg Morgan");										//10

		System.out.println("Here is the list of everyone in the class: ");
		System.out.println("\nCharles Pretty Boy Floyd");
		System.out.println("Charlie Lucky Luciano");
		System.out.println("Sam Golf Bag Hunt");
		System.out.println("Israel Icepick Willie Alderman");
		System.out.println("Vincent Mad Dog Coll");
		System.out.println("Thomas Butterfingers Moran");
		System.out.println("Lester Baby Face Nelson");
		System.out.println("George Machine Gun Kelly");
		System.out.println("Benjamin Bugsy Siegal");
		System.out.println("Joe Peg Leg Morgan");

		int num = 1;
		String newName = new String();
		int position = 0;

		while (num >= 1 && num <= 7)
		{	System.out.println("\n\n");
			System.out.println("Select an operation: ");
			System.out.println("#1. Add item");
			System.out.println("#2. Add item at an index");
			System.out.println("#3. Overwrite item at an index");
			System.out.println("#4. Remove item at an index");
			System.out.println("#5. Retrieve an item at an index");
			System.out.println("#6. Print list");
			System.out.println("#7. Exit Arraylist Manager");
			num = Keyboard.readInt();

			switch(num)
			{
				case 1: System.out.println("Add a name (Format: First Name  \'Nickname\'  Last Name ");
						newName = Keyboard.readString();
						stuff.add(newName);
						System.out.println("\n" + newName + " is now enrolled in the class!");
						break;

				case 2: System.out.println("Select a position in the index: ");
						position = Keyboard.readInt();
						System.out.println("Add a name (Format: First Name  \'Nickname\'  Last Name ");
						newName = Keyboard.readString();
						stuff.set(position, newName);
						System.out.println("\n" + newName + " was added to the role under " + position + " number");
						break;

				case 3: System.out.println("Select the position to overwrite: ");
						position = Keyboard.readInt();
						System.out.println("Add a name (Format: First Name  \'Nickname\'  Last Name ");
						newName = Keyboard.readString();
						stuff.set(position, newName);
						break;

				case 4: System.out.println("Remove a name at a position: ");
						position = Keyboard.readInt();
						stuff.remove(position);
						break;

				case 5: System.out.println("Enter a number to bring up the corresponding name: ");
						position = Keyboard.readInt();
						System.out.println(stuff.get(position));
						break;

				case 6: ListIterator iterator = stuff.listIterator();
						while(iterator.hasNext())
						{
							System.out.println(iterator.next());
						}
						break;

				case 7: System.out.println("You have chosen to exit the game.");
			}

			if(num == 7)
			{
				num = 999;
			}
		}

		System.out.println("\nGood bye.");
	}
}