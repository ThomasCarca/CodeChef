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
	 * Pow.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the long
	 */
	public static long pow(long a, long b) {
		long re = 1;
		while (b > 0) {
			if ((b & 1) == 1) {
				re *= a;
			}
			b >>= 1;
			a *= a;
		}
		return re;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int T = sc.nextInt();
		while (T-- > 0) {
			int b = sc.nextInt(), ls = sc.nextInt();
			double rsMin, rsMax;
			rsMin = Math.sqrt(pow(ls, 2) - pow(b, 2));
			rsMax = Math.sqrt(pow(b, 2) + pow(ls, 2));
			stdout.print(rsMin + " ");
			stdout.println(rsMax);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}