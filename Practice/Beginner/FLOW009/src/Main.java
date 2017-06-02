
/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
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
		DecimalFormat df = new DecimalFormat("#.000000");
		while (T-- > 0) {
			int q = sc.nextInt(), p = sc.nextInt();
			stdout.println(q > 1000 ? df.format(q*p-0.1*(q*p)) : df.format(q*p));
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}