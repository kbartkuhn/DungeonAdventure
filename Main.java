
import java.util.*;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		
		dice4 Foursided = new dice4();
		Dice6 Sixsided = new Dice6();
		Dice8 Eightsided = new Dice8();
		Dice10 Tensided = new Dice10();
		Dice12 Twelevesided = new Dice12();
		Dice20 Twentysided = new Dice20();
		
		Scanner input = new Scanner(System.in);
		List<Player> Players = new ArrayList<Player>();
		
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
		Players.add(new Player(Usernames[counter]));
		}
		
		input.close();
		

		System.out.println("Usernames are ");
		for (int counter = 0; counter < length; counter++) {
			System.out.println(Usernames[counter]);
		}
		
		System.out.println("Welcome to the dungeon. You start out with a health of 100.");
		System.out.println("You walk down the dark dungeon and you encounter your first enemy");
		System.out.println("Your first enemy is a troll. If you roll higher than the troll, you win and you can pass.");
		
		for (int i = 0; i < Players.size(); i++) {
			Sixsided.Roll();
			Players.get(i).score=Sixsided.result;
			
			if (Sixsided.result>4) {
				System.out.println("You have rolled high enough to slice the trolls head off");
				System.out.println("You now head further down the dungeon and you see another enemy");
		
			}
			else if (Sixsided.result<4){
				Players.get(0).health-=25; 
				
				
				
			}
		}
		
		
	
		{

		
	
		}
	}

}
