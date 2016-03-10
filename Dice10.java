import java.util.*;

public class Dice10 {

	Random r = new Random();

	int result = 0;

	public void Roll() {

		for (int i = 0; i < 1; i++) {
			result = r.nextInt(10);
			result++;

		}

	}
}
