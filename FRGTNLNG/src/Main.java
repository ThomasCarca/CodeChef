
/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

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
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FastReader r = new FastReader();
		PrintWriter stdout = new PrintWriter(System.out);
		int T = r.nextInt();
		while (T-- > 0) {
			int n = r.nextInt(), k = r.nextInt();
			String[] dictionnary = r.nextLine().split("\\s+");
			boolean[] used = new boolean[n];
			Arrays.fill(used, false);
			List<List<String>> sentences = new ArrayList<List<String>>();
			for (int i = 0; i < k; i++) {
				List<String> sentence = Arrays.asList(r.nextLine().split("\\s+"));
				sentences.add(sentence);
			}
			for (int i = 0; i < n; i++) {
				String word = dictionnary[i];
				for (List<String> s : sentences) {
					if (used[i]) {
						break;
					} else {
						used[i] = s.contains(word);
					}
				}
			}
			for (int i = 0; i < n; i++) {
				stdout.print((used[i] ? "YES" : "NO") + (i == n - 1 ? "" : " "));
			}
			stdout.println();
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