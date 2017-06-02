
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
		int T = Integer.parseInt(sc.nextLine().trim());
		while (T-- > 0) {
			String balloons = sc.nextLine().trim();
			int countA = balloons.length() - balloons.replace("a", "").length();
			int countB = balloons.length() - balloons.replace("b", "").length();
			stdout.println(Math.min(countA, countB));
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}