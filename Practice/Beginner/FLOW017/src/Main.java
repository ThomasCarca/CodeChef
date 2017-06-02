
/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		int T = Integer.parseInt(sc.nextLine().trim());
		while (T-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			List<Integer> values = new ArrayList<Integer>();
			values.add(a);
			values.add(b);
			values.add(c);
			Collections.sort(values);
			stdout.println(values.get(1));
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}