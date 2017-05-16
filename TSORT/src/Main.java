/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int n = sc.nextInt();
		List<Integer> values = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) values.add(sc.nextInt());
		values.stream().mapToInt(Integer::intValue).sorted().forEach(i -> stdout.println(i));
		sc.close();
		stdout.flush();
		stdout.close();
	}

}