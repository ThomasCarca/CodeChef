
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
		final int[] rs = new int[]{1, 2, 5, 10, 50, 100};
		int T = Integer.parseInt(sc.nextLine().trim());
		while (T-- > 0) {
			int n = sc.nextInt(), i = 5, acc = 0;
			while (n != 0) {
				if (n < rs[i]) {
					i--;
				} else {
					n -= rs[i];
					acc++;
				}
			}
			stdout.println(acc);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}