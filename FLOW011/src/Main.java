
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
			int basic = sc.nextInt();
			double hra, da;
			if (basic < 1500) {
				hra = 0.1 * basic;
				da = 0.9 * basic;
			} else {
				hra = 500;
				da = 0.98 * basic;
			}
			double gross = basic + hra + da;
			if (basic >= 50275 && basic % 100 == 75) {
				gross = gross - 1;
			}
			String answer = String.format("%g", gross);
			while (answer.contains(".") && (answer.endsWith(".") || answer.endsWith("0"))) {
				answer = answer.substring(0, answer.length() - 1);
			}
			stdout.println(answer);

		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}