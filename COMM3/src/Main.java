
/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
			int r = sc.nextInt(), xa = sc.nextInt(), ya = sc.nextInt(), xb = sc.nextInt(), yb = sc.nextInt(),
					xc = sc.nextInt(), yc = sc.nextInt();
			List<Double> distances = new ArrayList<Double>();
			distances.add(Math.sqrt(pow((xa-xb), 2)+pow((ya-yb), 2)));
			distances.add(Math.sqrt(pow((xa-xc), 2)+pow((ya-yc), 2)));
			distances.add(Math.sqrt(pow((xb-xc), 2)+pow((yb-yc), 2)));
			boolean res = distances.stream().filter(d -> d <= r).count() >= 2;
			stdout.println(res ? "yes" : "no");
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}