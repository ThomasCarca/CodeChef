
/*
 * Created by Thomas Boulbes
 */
import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
			int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
			List<Integer> files = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());
			List<Integer> ignored = new ArrayList<Integer>();
			List<Integer> tracked = new ArrayList<Integer>();
			for (int i = 0; i < m; i++) {
				ignored.add(sc.nextInt());
			}
			for (int i = 0; i < k; i++) {
				tracked.add(sc.nextInt());
			}
			List<Integer> ignoredAndTracked = ignored.stream().filter(tracked::contains).collect(toList());
			List<Integer> unIgnoredAndUnTracked = files.stream().filter(i -> !ignored.contains(i))
					.filter(i -> !tracked.contains(i)).collect(Collectors.toList());
			stdout.println(ignoredAndTracked.size() + " " + unIgnoredAndUnTracked.size());
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}