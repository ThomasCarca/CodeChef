
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
	 * @return the long
	 */
	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
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
			long n = sc.nextLong(), m = sc.nextLong(), gcd = gcd(Math.max(n, m), Math.min(n, m));
			stdout.println((n/gcd)*(m/gcd));
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}