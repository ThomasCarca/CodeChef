
/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.stream.Stream;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	static String solve(int n, String line) {
		int[] a = Stream.of(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int flagNeg1 = 0, flag1 = 0, flagOther = 0;
		String ret = "yes";
		for (int i : a) {
			switch (i) {
			case -1:
				flagNeg1++;
				break;

			case 1:
				flag1++;
				break;

			case 0:
				break;

			default:
				flagOther++;
				break;
			}
		}
		if (flagOther > 1 || (flagOther > 0 && flagNeg1 > 0) || (flagNeg1 > 1 && flag1 == 0)) {
			ret = "no";
		}
		return ret;
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
			int n = rdr.nextInt();
			String line = rdr.nextLine();
			stdout.println(solve(n, line));
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

		/** The br. */
		BufferedReader br;

		/** The st. */
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