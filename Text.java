
public class Text {

	public void IntroText() {
		System.out.println("Welcome to FalloutDice.");
		System.out.println();
		System.out.println("Please enter numberofplayers.");
	}

	public void FirstEnemy() {
		System.out.println();
		System.out.println("You've been held captive in an enemy's dungeon, escape before your\n"
				+ "Empire's taken over. You start out with a health of 100 & only have your sword\n"
				+ "as a weapon. Good luck.");
		System.out.println();
		System.out.println("You walk down the dark dungeon and you encounter your first enemy");
		System.out.println("A BIG UGLY TROLL stands before you. Roll higher than the Troll to advance, or else.");
		System.out.println("");
		System.out.println("");
	}

	public void FirstWin() {
		System.out.println("You leap and slice the trolls head off, ADVANCE.");
		System.out.println("You now head further down the dungeon and you see another enemy");
		System.out.println();
		System.out.println("Level 2: You survived the Troll, adrenaline pumps through your veins");
		System.out.println(" the cave gets darker & hotter. Your pores are oozing sweat.");
		System.out.println();
		System.out.println("A DRAGON!");
	}

	public void DodgeTroll() {
		System.out.println();
		System.out.println("You did not roll high enough to beat the troll, but you dodge the troll attack.");
		System.out.println("And escape down a path you did not previously see before");
		System.out
				.println("You head down the path and you come up to another monster. This one is a very large SNAKE");
		System.out.println("Would you like to head down this path?");
		System.out.println("You can choose [Yes] or [No]");

	}

	public void Giant() {
		System.out.println("You can see the light at the end of the tunnel");
		System.out.println("But there is one final monster you must battle");
		System.out.println("You are about to go up against a GIANT");
	}

	public void BeatGiant() {
		System.out.println("You have slain the monster. You now get to leave the dungeon");
		System.out.println("                                                    ");
		System.out.println("You leave the dungeon and run to the nearest town");
		System.out.println("                                                ");
		System.out.println("You reach the town and run to the nearest bar for safety");
		System.out.println("              ");
		System.out.println("You hide there until nightfall, and safely make it home.");
		System.out.println();
	}

	public void RightFork() {
		System.out.println("");
		System.out.println("FINAL LEVEL. You've defeated two monsters, you're drained");
		System.out.println("but theres a rope that will lead you out of the dungeon by climbing.");
		System.out.println("Can you muster enough strength and get back home?");
	}

	public void DungeonFork() {
		System.out.println("You dart down the hall, and you come to a fork in the dungeon");
		System.out.println("You can either choose to go the left or go to the right");
		System.out.println("[Left] or [Right]");

	}
}
