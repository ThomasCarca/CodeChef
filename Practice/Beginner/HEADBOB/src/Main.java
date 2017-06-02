
/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
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
			sc.nextLine().trim();
			String value = sc.nextLine().trim();
			if (value.contains("Y")) {
				stdout.println("NOT INDIAN");
			} else if (value.contains("I")) {
				stdout.println("INDIAN");
			} else {
				stdout.println("NOT SURE");
			}
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}