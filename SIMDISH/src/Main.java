/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;

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
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter stdout = new PrintWriter(System.out);
		int t = Integer.valueOf(stdin.readLine());
		for (int i = 0; i < t; i++) {
			int similitude = 0;
			LinkedList<String> recipe1 = new LinkedList<String>(Arrays.asList(stdin.readLine().split(" ")));
			LinkedList<String> recipe2 = new LinkedList<String>(Arrays.asList(stdin.readLine().split(" ")));
			while (similitude < 2 && recipe1.size() > 0) {
				if (recipe2.contains(recipe1.get(0)))
					similitude++;
				recipe1.remove(0);
			}
			stdout.println(similitude > 1 ? "similar" : "dissimilar");
		}
		stdout.flush();
		stdout.close();
	}

}