import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, welcome to FalloutDice.");
		System.out.println();
		System.out.println("Please enter numberofplayers.");
		int length;
		length = input.nextInt();

		String[] Usernames = new String[length];

		for (int counter = 0; counter < length; counter++) 
		{
			System.out.println("Enter Username " +(counter + 1));
			Usernames[counter] = input.next();
		}
		
		input.close();

		System.out.println("Usernames are ");
		for (int counter = 0; counter < length; counter++) {
			System.out.println(Usernames[counter]);
		}
		System.out.println();
		System.out.println("Welcome" + Usernames + "to FalloutDungeon. " );
	
		{

		dice4 dice4 = new dice4();
		Dice6 Dice6 = new Dice6();
		Dice8 Dice8 = new Dice8();
		Dice10 Dice10 = new Dice10();
		Dice12 Dice12 = new Dice12();
		Dice20 Dice20 = new Dice20();
	
		}
	}

}
