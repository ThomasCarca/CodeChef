import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int n = sc.nextInt(), max = 0, previousP1 = 0, previousP2 = 0, bestPlayer = 0, p1, p2, delta;
		previousP1 = 0;
		previousP2 = 0;
		for (int i = 1; i < n; i++) {
			p1 = sc.nextInt() + previousP1;
			p2 = sc.nextInt() + previousP2;
			delta = p1-p2;
			if (delta > max) {
				bestPlayer = 1;
				max = delta;
			} else if ((0-delta) > max) {
				bestPlayer = 2;
				max = (0-delta);
			}
			previousP1 = p1;
			previousP2 = p2;
		}
		stdout.print(bestPlayer + " " + max);
		sc.close();
		stdout.flush();
		stdout.close();
	}

}