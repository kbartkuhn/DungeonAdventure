
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, welcome to FalloutDice.");
		System.out.println();
		System.out.println("Please enter numberofplayers.");
		int numberofplayers = input.nextInt();
		
		Player player = new Player(numberofplayers);
		player.getPLayers();
				
		
		dice4 dice4 = new dice4();
		Dice6 Dice6 = new Dice6();
		Dice8 Dice8 = new Dice8();
		Dice10 Dice10 = new Dice10();
		Dice12 Dice12 = new Dice12();
		Dice20 Dice20 = new Dice20();
	
		
		dice4.Roll();		
		Dice6.Roll();
		Dice8.Roll();
		Dice10.Roll();
		Dice12.Roll();
		Dice20.Roll();
	}

}
