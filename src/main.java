import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, welcome to FalloutDice.");
		System.out.println();
		System.out.println("Please enter numberofplayers.");
		int numberofplayers = input.nextInt();
		
		Player player = new Player(numberofplayers);
		player.getPLayers();
		
		
		

	}

}
