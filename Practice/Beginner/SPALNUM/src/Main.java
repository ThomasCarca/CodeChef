
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
	 * Checks if is palindrome.
	 *
	 * @param val the val
	 * @return true, if is palindrome
	 */
	public static boolean isPalindrome(int val) {
		String value = Integer.toString(val);
		return value.equals(new StringBuilder(value).reverse().toString());
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
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int T = Integer.parseInt(sc.nextLine().trim());
		int[] sums = new int[100001];
		sums[0] = 1;
		for (int i = 1; i <= 100000; i++) {
			sums[i] = sums[i-1];
			if (isPalindrome(i)) sums[i] += i;
		}
		while (T-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt();
			stdout.println(sums[b]-sums[a-1]);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}