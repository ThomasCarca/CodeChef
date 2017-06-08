
/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/** The Constant modulo = 10^9+7. */
	public static final long MOD = 1000000007;

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		FastReader rdr = new FastReader();
		PrintWriter stdout = new PrintWriter(System.out);
		int T = rdr.nextInt();
		while (T-- > 0) {
			int p = rdr.nextInt(), q = rdr.nextInt(), r = rdr.nextInt(), xi = 0, zi = 0;
			long[] a = new long[p + 1], b = new long[q], c = new long[r + 1];
			long total = 0;
			for (int i = 1; i <= p; i++)
				a[i] = rdr.nextInt();
			for (int i = 0; i < q; i++)
				b[i] = rdr.nextInt();
			for (int i = 1; i <= r; i++)
				c[i] = rdr.nextInt();
			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);
			for (int yi = 0; yi < q; yi++) {
				long y = b[yi];
				while (xi < p && a[xi + 1] <= y) {
					a[xi + 1] += a[xi];
					xi++;
				}
				while (zi < r && c[zi + 1] <= y) {
					c[zi + 1] += c[zi];
					zi++;
				}
				long xy = (a[xi] + xi * y) % MOD;
				long yz = (c[zi] + zi * y) % MOD;
				total = (total + (xy * yz)) % MOD;
			}
			stdout.println(total);
		}
		stdout.flush();
		stdout.close();
	}

	//////////////////////////////////////////////////
	////////////////// +--------+ ////////////////////
	////////////////// | READER | ////////////////////
	////////////////// +--------+ ////////////////////
	//////////////////////////////////////////////////

	/**
	 * The Class FastReader.
	 */
	static class FastReader {

		/** The BufferedReader. */
		BufferedReader br;

		/** The StringTokenizer. */
		StringTokenizer st;

		/**
		 * Instantiates a new fast reader.
		 */
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		/**
		 * Next.
		 *
		 * @return the string
		 */
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		/**
		 * Next int.
		 *
		 * @return the int
		 */
		int nextInt() {
			return Integer.parseInt(next());
		}

		/**
		 * Next long.
		 *
		 * @return the long
		 */
		long nextLong() {
			return Long.parseLong(next());
		}

		/**
		 * Next double.
		 *
		 * @return the double
		 */
		double nextDouble() {
			return Double.parseDouble(next());
		}

		/**
		 * Next line.
		 *
		 * @return the string
		 */
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}