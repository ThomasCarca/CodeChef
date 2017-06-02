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
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int amount = sc.nextInt();
		double max = sc.nextDouble();
		String res;
		if (amount%5==0 && amount+0.50 <= max) {
			res = String.format("%.2f", max-amount-0.5);
		} else {
			res = String.format("%.2f", max);
		}
		stdout.print(res);
		sc.close();
		stdout.flush();
		stdout.close();
	}

}