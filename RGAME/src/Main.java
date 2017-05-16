/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * Pow.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the double
	 */
	public static double pow(double a, int b) {
		double result = 1;
		while (b > 0) {
			if (b % 2 != 0) {
				result *= a;
				b--;
			}
			a *= a;
			b /= 2;
		}
		return result;
	}
	
	/**
	 * Inits the boards.
	 *
	 * @param size the size
	 * @return the linked list[]
	 */
	@SuppressWarnings("unchecked")
	public static LinkedList<Long>[] initBoards(int size) {
		LinkedList<Long>[] boards = new LinkedList[size];
		for (int i = 0; i < boards.length; i++) {
			boards[i] = new LinkedList<Long>();
		}
		return boards;
	}

	/**
	 * Score.
	 *
	 * @param boards the boards
	 * @return the int
	 */
	public static int score(LinkedList<Long>[] boards) {
		int score = 0;
		int modulo = 1000000007;
		for (int i = 0; i < boards.length; i++) {
			LinkedList<Long> board = boards[i];
			int boardScore = 0;
			for (int j = 0; j < board.size() - 1; j++) {
				boardScore += board.get(j) * board.get(j + 1);
			}
			score += boardScore % modulo;
		}
		return score % modulo;
	}

	/**
	 * Compute games.
	 *
	 * @param boards the boards
	 * @param values the values
	 * @return the linked list[]
	 */
	public static LinkedList<Long>[] computeGames(LinkedList<Long>[] boards, LinkedList<String> values) {
		if (values.isEmpty()) {
			return boards;
		} else {
			final int n = (int) (pow(2, values.size() - 1));
			Long value = Long.parseLong(values.removeFirst());
			for (int i = 0; i < boards.length; i++) {
				if ((i / n) % 2 == 0) {
					boards[i].addFirst(value);
				} else {
					boards[i].addLast(value);
				}
			}
			return computeGames(boards, values);
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter stdout = new PrintWriter(System.out);
		int t = Integer.valueOf(stdin.readLine());
		for (int i = 0; i < t; i++) {
			final int N = Integer.valueOf(stdin.readLine());
			LinkedList<String> values = new LinkedList<String>(Arrays.asList(stdin.readLine().split(" ")));
			LinkedList<Long>[] boards = initBoards((int) pow(2, N));
			stdout.println(score(computeGames(boards, values)));
		}
		stdout.flush();
		stdout.close();
	}
}




