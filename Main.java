import java.util.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Text Text = new Text();

		dice4 Foursided = new dice4();
		Dice6 Sixsided = new Dice6();
		Dice8 Eightsided = new Dice8();
		Dice10 Tensided = new Dice10();
		Dice12 Twelvesided = new Dice12();
		Dice20 Twentysided = new Dice20();

		Scanner input = new Scanner(System.in);
		List<Player> Players = new ArrayList<Player>();

		String ChoosePath, Fork;

		Text.IntroText();
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

		Text.FirstEnemy();

		for (int i = 0; i < Players.size(); i++) {
			Sixsided.Roll();
			Players.get(i).score = Sixsided.result;

			if (Players.get(i).score > 3) {
				System.out.println("You rolled a " + Players.get(i).score);
				Text.FirstWin();

				for (int d = 0; d < Players.size(); d++) {
					Tensided.Roll();
					Players.get(d).score = Tensided.result;

					if (Players.get(d).score >= 6) {
						System.out.println("you rolled a " + Players.get(d).score);
						System.out.println("You dodge the Dragons flame, slice his tail off");
						System.out.println("and the Dragon flies away wimpering.");
					}

					else if (Players.get(d).score < 6) {
						Players.get(d).health -= 25;
						System.out.println("you rolled a " + Players.get(d).score);
						System.out.println("You did not beat the dragon and your mother is dead");
					}
			
				}
			} else if (Players.get(i).score <= 3) {
				System.out.println("You rolled a " + Players.get(i).score);
				Text.DodgeTroll();
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
					Text.DungeonFork();
					Fork = input.next();
					if (Fork.equals("Left")) {
						Text.Giant();

						for (int m = 0; m < Players.size(); m++) {
							Foursided.Roll();
							Players.get(m).score = Foursided.result;

							if (Players.get(m).score > 0) {
								Text.BeatGiant();
							}

						}

					}

					else if (Fork.equals("Right")) {
						Text.RightFork();

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