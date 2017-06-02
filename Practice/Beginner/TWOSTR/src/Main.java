
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
			char[] str1 = sc.nextLine().trim().toCharArray(), str2 = sc.nextLine().trim().toCharArray();
			int n = str1.length-1;
			boolean match = true;
			while (n > -1 && match) {
				match = str1[n] == '?' || str2[n] == '?' || str1[n] == str2[n];
				n--;
			}
			stdout.println(match ? "Yes" : "No");
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}