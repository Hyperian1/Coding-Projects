import java.util.ArrayList;
import java.util.Random;

public class MineField {

	public final static int FIELD_SIZE = 1000;
	public final static int NUM_BOMBS = 9;
	public static boolean[][] field = new boolean[FIELD_SIZE][FIELD_SIZE];
	private static Random random = new Random();

	public static ArrayList<Searcher> searchers = new ArrayList<Searcher>();

	public static void main(String[] args) {

		int i = 0;
		while (i < NUM_BOMBS) {

			int x = random.nextInt(FIELD_SIZE);
			int y = random.nextInt(FIELD_SIZE);

			if (field[x][y] == true) {
				continue;
			} else {

				field[x][y] = true;
				i++;

			}

		}
		synchronized (field) {
		for(int z = 0; z < NUM_BOMBS + 1; z++) {
			
			searchers.add(new Searcher());
			Thread thisThread = new Thread(searchers.get(z));
			thisThread.start();
		}
		}

		

	}

}
