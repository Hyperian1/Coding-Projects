import java.util.Random;

public class Searcher implements Runnable {

	private static Random random = new Random();

	public void run() {
		
		while (true) {
			synchronized (MineField.field) {
			if (MineField.searchers.size() == 1) {
				System.out.println(Thread.currentThread().getName() + " is the winner!");
				return;
			}

			
				int x = random.nextInt(MineField.FIELD_SIZE);
				int y = random.nextInt(MineField.FIELD_SIZE);
				if (MineField.field[x][y] == true) {
					MineField.field[x][y] = false;
					System.out.println(Thread.currentThread().getName() + " has blown up at x: " + x + ", y: " + y);
					MineField.searchers.remove(this);
					return;
				}
			}
		}

	}
}
