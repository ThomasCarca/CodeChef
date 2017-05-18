
/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
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
			double h = sc.nextDouble(), cc = sc.nextDouble(), ts = sc.nextDouble();
			boolean c1 = h > 50, c2 = cc < 0.7, c3 = ts > 5600;
			if (c1 && c2 && c3) {
				stdout.println(10);
			} else if (c1 && c2) {
				stdout.println(9);
			} else if (c2 && c3) {
				stdout.println(8);
			} else if (c1 && c3) {
				stdout.println(7);
			} else if (c1 || c2 || c3) {
				stdout.println(6);
			} else {
				stdout.println(5);
			}
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}