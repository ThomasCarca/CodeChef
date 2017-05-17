
/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
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
		Map<String, String> values = new HashMap<String, String>();
		values.put("B", "BattleShip");
		values.put("C", "Cruiser");
		values.put("D", "Destroyer");
		values.put("F", "Frigate");
		while (T-- > 0) {
			stdout.println(values.get(sc.nextLine().trim().toUpperCase()));
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}