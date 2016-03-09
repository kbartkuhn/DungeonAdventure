import java.util.Scanner;

public class Player {
	String Username;
	int numberofplayers;
	int health = 100;

	public Player(int numberofplayers) {
		this.numberofplayers = numberofplayers;
	}

	public void getPLayers() {
		if (numberofplayers == 1) {
			System.out.println("Enter Username");
		} else {
			System.out.println("Enter Usernames");
		}
		

	}

}
