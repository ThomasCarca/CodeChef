/*
 * Created by Thomas Boulbes
 */


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
	 * Gcd.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the int
	 */
	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
	
	/**
	 * Lcm.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the int
	 */
	public static long lcm(long a, long b) {
		return (a*b)/gcd(a, b);
	}

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
			long a = sc.nextInt(), b = sc.nextInt();
			stdout.println(gcd(a, b) + " " + lcm(a,b));
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}