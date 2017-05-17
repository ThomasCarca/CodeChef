
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
			int n = sc.nextInt(), i = n - 1;
			boolean isPrime = n != 1;
			while (i-- >= Math.sqrt(n) && isPrime && i != 1) {
				isPrime = n % i != 0;
			}
			stdout.println(isPrime ? "yes" : "no");
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}