
/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Stream;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	static double solve(int n, ArrayList<String> recipes) {
		double totalLoss = 0;
		for (String recipe : recipes) {
			int[] values = Stream.of(recipe.split("\\s+")).mapToInt(Integer::parseInt).toArray();
			double price = values[0], quantity = values[1], discount = ((double) values[2]) / 100.00, newPrice; 
			newPrice = price * discount + price;
			totalLoss += quantity * (price - (newPrice * (1.00 - discount)));
		}
		return totalLoss;
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
			ArrayList<String> recipes = new ArrayList<String>();
			while (n-- > 0)
				recipes.add(rdr.nextLine());
			stdout.printf("%.7f", solve(n, recipes));
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