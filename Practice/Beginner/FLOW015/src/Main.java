
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

	/** The Constant MON. */
	public static final String MON = "monday";
	
	/** The Constant TUE. */
	public static final String TUE = "tuesday";
	
	/** The Constant WED. */
	public static final String WED = "wednesday";
	
	/** The Constant THU. */
	public static final String THU = "thursday";
	
	/** The Constant FRI. */
	public static final String FRI = "friday";
	
	/** The Constant SAT. */
	public static final String SAT = "saturday";
	
	/** The Constant SUN. */
	public static final String SUN = "sunday";

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
			int year = rdr.nextInt();
			int day = (int) (year * 365 + Math.floor((year - 1) / 4) - Math.floor((year - 1) / 100)
					+ Math.floor((year - 1) / 400)) % 7;
			switch (day) {
			case 1:
				stdout.println(MON);
				break;
			case 2:
				stdout.println(TUE);
				break;
			case 3:
				stdout.println(WED);
				break;
			case 4:
				stdout.println(THU);
				break;
			case 5:
				stdout.println(FRI);
				break;
			case 6:
				stdout.println(SAT);
				break;
			case 0:
				stdout.println(SUN);
				break;

			}

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