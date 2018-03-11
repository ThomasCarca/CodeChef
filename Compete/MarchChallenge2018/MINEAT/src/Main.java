
/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	static int bestSpeed(int min, int max, int speed, int h, List<Integer> piles) {
		int eT0 = 0, eT1 = 0;
		for (Integer pile : piles) {
			eT0 += Math.ceil((float) pile / (float) speed);
			eT1 += Math.ceil((float) pile / (float) (speed - 1));
		}
		if (speed == 1 || (eT0 <= h && eT1 > h)) {
			return speed;
		} else {
			if (eT0 < h) {
				max = speed;
				speed = (max + min) / 2;
			} else if (eT0 > h) {
				min = speed;
				speed = (max + min) / 2;
			} else {
				speed--;
			}
			return bestSpeed(min, max, speed, h, piles);
		}
	}

	static int solve(int n, int h, String piles) {
		List<Integer> pilesList = Stream.of(piles.split("\\s+")).mapToInt(Integer::parseInt).boxed()
				.collect(Collectors.toList());
		int min = 1, max = pilesList.stream().mapToInt(val -> val).max().getAsInt(), speed = (max + min) / 2;
		if (h <= n) {
			return max;
		} else {
			return bestSpeed(min, max, speed, h, pilesList);
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
		FastReader rdr = new FastReader();
		PrintWriter stdout = new PrintWriter(System.out);
		int T = rdr.nextInt();
		while (T-- > 0) {
			int n = rdr.nextInt(), h = rdr.nextInt();
			String piles = rdr.nextLine();
			stdout.println(solve(n, h, piles));
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