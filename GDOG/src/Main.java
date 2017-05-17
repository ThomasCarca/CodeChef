
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
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt(), k = sc.nextInt(), max = 0;
			for (int i = k; i > 0; i--)
				if (n % i > max)
					max = n % i;
			stdout.println(max);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}