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
		while (n != 0) {
			int count = n;
			int[] values = new int[count];
			for (int i = 0; i < count; i++) {
				values[i] = sc.nextInt();
			}
			while (count > 0 && values[values[count-1]-1] == count) {
				count--;
			}
			stdout.println(count==0?"ambiguous":"not ambiguous");
			n = sc.nextInt();
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}