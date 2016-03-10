import java.util.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		dice4 Foursided = new dice4();
		Dice6 Sixsided = new Dice6();
		Dice8 Eightsided = new Dice8();
		Dice10 Tensided = new Dice10();
		Dice12 Twelvesided = new Dice12();
		Dice20 Twentysided = new Dice20();

		Scanner input = new Scanner(System.in);
		List<Player> Players = new ArrayList<Player>();

		String ChoosePath, Fork;

		System.out.println("Hello, welcome to FalloutDice.");
		System.out.println();
		System.out.println("Please enter numberofplayers.");
		int length;
		length = input.nextInt();

		String[] Usernames = new String[length];

		for (int counter = 0; counter < length; counter++) {
			System.out.println("Enter Username " + (counter + 1));
			Usernames[counter] = input.next();
			Players.add(new Player(Usernames[counter]));
		}

		System.out.println("Usernames are ");
		for (int counter = 0; counter < length; counter++) {
			System.out.println(Usernames[counter]);
		}

		System.out.println("Welcome to the dungeon. You start out with a health of 100.");
		System.out.println("You walk down the dark dungeon and you encounter your first enemy");
		System.out.println("Your first enemy is a troll. If you roll higher than the troll or face defeat.");
		System.out.println("");
		System.out.println("");

		for (int i = 0; i < Players.size(); i++) {
			Sixsided.Roll();
			Players.get(i).score = Sixsided.result;

			if (Players.get(i).score > 3) {
				System.out.println("You rolled a " + Players.get(i).score);
				System.out.println("You have rolled high enough to slice the trolls head off");
				System.out.println("You now head further down the dungeon and you see another enemy");
				System.out.println();
				System.out.println("Level 2: You survived the Troll, adrenaline pumps through your veins\n"
						+ " the cave gets darker & hotter. Your pores are oozing sweat.");
				System.out.println();
				System.out.println("A Dragon!");

				for (int d = 0; d < Players.size(); d++) {
					Tensided.Roll();
					Players.get(d).score = Tensided.result;

					if (Players.get(d).score >= 6) {
						System.out.println("you rolled a " + Players.get(d).score);
						System.out.println("You dodge the Dragons flame, slice his tail off\n"
								+ " and the Dragon flies away wimpering.");

					} else if (Players.get(d).score < 6) {
						Players.get(d).health -= 25;
						System.out.println("you rolled a " + Players.get(d).score);
						System.out.println("You did beat the dragon and your mother is dead");
					}

				}
			} else if (Players.get(i).score <= 3) {
				System.out.println("You rolled a " + Players.get(i).score);
				System.out.println("You did not roll high enough to beat the troll, but you dodge the troll attack.");
				System.out.println("And escape down a path you did not previously see before");
				System.out.println(
						"You head down the path and you come up to another monster. This one is a very large DRAGON");
				System.out.println("Would you like to head down this path?");
				System.out.println("You can choose [Yes] or [No]");
				ChoosePath = input.next();

				if (ChoosePath.equals("Yes")) {
					System.out.println("You have choose to fight the monster");

					for (int k = 0; k < Players.size(); k++) {
						Twelvesided.Roll();
						Players.get(k).score = Twelvesided.result;

						if (Players.get(k).score > 0) {
							System.out.println("You have slain the monster. You now get to enjoy a nice beverage");
						}
					}
				}
				if (ChoosePath.equals("No")) {
					System.out.println("You dart down the hall, and you come to a fork in the dungeon");
					System.out.println("You can either choose to go the left or go to the right");
					System.out.println("[Left] or [Right]");
					Fork = input.next();
					if (Fork.equals("Left")) {
						System.out.println("You can see the light at the end of the tunnel");
						System.out.println("But there is one final monster you must battle");
						System.out.println("You are about to go up against a giant");

						for (int m = 0; m < Players.size(); m++) {
							Foursided.Roll();
							Players.get(m).score = Foursided.result;

							if (Players.get(m).score > 0) {
								System.out.println("You have slain the monster. You now get to leave the dungeon");
							}

						}

					}

					else if (Fork.equals("Right")) {
						System.out.println("");
						System.out.println("FINAL LEVEL. \nYou've defeated two monsters, you're drained\n"
								+ "but theres a rope that will lead you out of the dungeon by climbing.\n"
								+ "Can you muster enough strength and get back home?");

						for (int f = 0; f < Players.size(); f++) {
							Eightsided.Roll();
							Players.get(f).score = Eightsided.result;
							System.out.println();
							System.out.println("You rolled a *" + Eightsided.result);

							Twentysided.Roll();
							Players.get(f).score = Twentysided.result;
							System.out.println("You rolled a ^ " + Twentysided.result);

							Foursided.Roll();
							Players.get(f).score = Foursided.result;
							System.out.println("You rolled a - " + Foursided.result);

							int sumofrolls = Eightsided.result + Twentysided.result + Foursided.result;
							System.out.println("Total roll " + sumofrolls);
							System.out.println("You have rolled high enough to get out of the dungeon");
							System.out.println("You climb out of the dungeon and you run for safety");

						}

					}
				}
			}
		}
	}
}
