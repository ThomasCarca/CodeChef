
/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

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
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			 HashSet<Integer> dolls = new HashSet<Integer>();
			for (int i = 0; i < n; i++) {
				int v = sc.nextInt();
				if (dolls.contains(v)) {
					dolls.remove(v);
				} else {
					dolls.add(v);
				}
			}
			Iterator<Integer> iter = dolls.iterator();
	        stdout.println(iter.next());
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}