
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

	public static int count(int[] arr, int index) {
		boolean keepCounting = true;
		int count = 0;
		while (keepCounting) {
			count++;
			keepCounting = index < arr.length - 1 && arr[index] * arr[index + 1] == -1;
			index++;
		}
		return count;
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
			int[] arr = new int[n], count = new int[n];
			boolean keepCounting = true;
			arr[0] = rdr.nextInt() >= 0 ? 1 : -1;
			count[0] = 1;
			for (int i = 1; i < n; i++) {
				arr[i] = rdr.nextInt() >= 0 ? 1 : -1;
				if (keepCounting) {
					keepCounting = arr[i] * arr[i - 1] == -1;
					count[0] += keepCounting ? 1 : 0;
				}
			}
			for (int i = 1; i < n; i++) {
				if (count[i - 1] == 1) {
					count[i] = count(arr, i);
				} else {
					count[i] = count[i - 1] - 1;
				}
				stdout.print(count[i-1] + " ");
			}
			stdout.println(count[n-1]);
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