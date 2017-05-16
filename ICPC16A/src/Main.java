/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

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
			String[] coordinates = stdin.readLine().split(" ");
			int x1 = Integer.parseInt(coordinates[0]);
			int y1 = Integer.parseInt(coordinates[1]);
			int x2 = Integer.parseInt(coordinates[2]);
			int y2 = Integer.parseInt(coordinates[3]);
			if (x1 != x2 && y1 != y2) {
				stdout.println("sad");
			} else if (x1 > x2) {
				stdout.println("left");
			} else if (x1 < x2) {
				stdout.println("right");
			} else if (y1 > y2) {
				stdout.println("down");
			} else {
				stdout.println("up");
			}
		}
		stdout.flush();
		stdout.close();
	}
}