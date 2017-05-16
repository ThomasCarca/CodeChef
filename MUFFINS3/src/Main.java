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
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			stdout.println(val%2==0 ? (val/2)+1 : (val+1)/2);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}