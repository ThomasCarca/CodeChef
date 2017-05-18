
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
		int T = sc.nextInt(), even = 0, total = T;
		while (T-- > 0) {
			int s = sc.nextInt();
			if (s%2==0) even++;
		}
		stdout.println(even>total-even? "READY FOR BATTLE" : "NOT READY");
		sc.close();
		stdout.flush();
		stdout.close();
	}

}