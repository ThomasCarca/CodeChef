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
		int T = Integer.parseInt(sc.nextLine().trim());
		while (T-->0) {
			int n = Integer.parseInt(sc.nextLine().trim());
			int[][] a = new int[n][n];
			for (int i = 0; i < n; i++) {
				String line = sc.nextLine();
				String[] l = line.split("\\s+");
				for (int j = 0; j <= i; j++) {
					a[i][j] = Integer.parseInt(l[j]);
				}
			}
			for (int i = n-1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					a[i-1][j] += Math.max(a[i][j], a[i][j+1]);
				}
			}
			stdout.println(a[0][0]);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}