
/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/** The Constant modulo = 10^9+7. */
	public static final long MOD = 1000000007;

	/**
	 * Sum filtered.
	 *
	 * @param full the complete array of value
	 * @param y the value that any other value must not exceed
	 * @return the sum between each (val+y) where val is in full and val <= y
	 */
	public static long sumFiltered(long[] full, long y) {
		long total = 0;
		for (int i = 0; i < full.length; i++) {
			long val = full[i];
			if (val <= y)
				total += val + y;
		}
		return total;
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
		FastReader rdr = new FastReader();
		PrintWriter stdout = new PrintWriter(System.out);
		int T = rdr.nextInt();
		while (T-- > 0) {
			int p = rdr.nextInt(), q = rdr.nextInt(), r = rdr.nextInt();
			long[] a = new long[p], b = new long[q], c = new long[r];
			long total = 0;
			for (int i = 0; i < p; i++)
				a[i] = rdr.nextLong();
			for (int i = 0; i < q; i++)
				b[i] = rdr.nextLong();
			for (int i = 0; i < r; i++)
				c[i] = rdr.nextLong();
			for (int i = 0; i < q; i++) {
				long y = b[i];
				long xy = sumFiltered(a, y) % MOD;
				long yz = sumFiltered(c, y) % MOD;
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