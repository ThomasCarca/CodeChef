
/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
			HashSet<Integer> unsafe = new HashSet<Integer>();
			for (int i = 0; i < n; i++) {
				int house = sc.nextInt();
				int min = house - x * y >= 1 ? house - x * y : 1;
				int max = house + x * y <= 100 ? house + x * y : 100;
				for (int covered = min; covered <= max; covered++) {
					if (!unsafe.contains(covered))
						unsafe.add(covered);
				}
			}
			stdout.println(100 - unsafe.size());
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}