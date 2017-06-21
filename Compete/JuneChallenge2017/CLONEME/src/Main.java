
/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {
	
	private static LinkedList<Integer> addValue(LinkedList<Integer> l, int val) {
		if (l.size() == 0) {
			l.add(val);
		} else if (l.get(0) > val) {
			l.add(0, val);
		} else if (l.get(l.size() - 1) < val) {
			l.add(l.size(), val);
		} else {
			int i = 0;
			while (l.get(i) < val) {
				i++;
			}
			l.add(i, val);
		}
		return l;
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
			int n = rdr.nextInt(), q = rdr.nextInt();
			int[] numbers = new int[n];
			for (int i = 0; i < n; i++) {
				numbers[i] = rdr.nextInt();
			}
			for (int i = 0; i < q; i++) {
				int a = rdr.nextInt(), b = rdr.nextInt(), c = rdr.nextInt(), d = rdr.nextInt(), count = 0;
				LinkedList<Integer> sub1 = new LinkedList<Integer>();
				LinkedList<Integer> sub2 = new LinkedList<Integer>();
				for (int j1 = a-1, j2 = c-1; j1 < b; j1++, j2++) {
					sub1 = addValue(sub1, numbers[j1]);
					sub2 = addValue(sub2, numbers[j2]);
				}
				Iterator<Integer> it1 = sub1.iterator();
				Iterator<Integer> it2 = sub2.iterator();
				while (it1.hasNext() && count <= 1) {
					Integer number1 = (Integer) it1.next();
					Integer number2 = (Integer) it2.next();
					if (number1 != number2) 
						count++;
				}
				stdout.println(count <= 1 ? "YES" : "NO");
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