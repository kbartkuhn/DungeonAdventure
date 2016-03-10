import java.util.Random;

public class dice4 {

	Random r = new Random();

	int result = 0;

	public void Roll() {

		for (int i = 0; i < 1; i++) {
			result = r.nextInt(4);
			result++;

		}

	}
}
