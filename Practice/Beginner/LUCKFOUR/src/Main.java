/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int T = Integer.parseInt(sc.nextLine().trim());
		while (T-- > 0) {
			char[] values = sc.nextLine().toCharArray();
			Stream<Character> cStream = IntStream.range(0, values.length).mapToObj(i -> values[i]);
			stdout.println(cStream.filter(i -> i == '4').count());
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}