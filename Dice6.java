

import java.util.Random;

public class Dice6 {



	Random r = new Random();

	int result = 0;


	public void Roll (){
		for (int i = 0; i < 1; i++ ) {
			result = r.nextInt(6);
			result++;
		}
	}

}



