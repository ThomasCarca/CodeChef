
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
		int T = sc.nextInt();
		List<Integer> values = new ArrayList<Integer>();
		while (T-- > 0) {
			values.add(sc.nextInt());
		}
		int max = Collections.max(values);
		int[] squares = new int[max];
		for (int i = 3, j = 1; i < max; i++) {
			squares[i] = squares[i-2] + j;
			if (i%2==0) j++;
		}
		for (int value : values) {
			stdout.println(squares[value-1]);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}