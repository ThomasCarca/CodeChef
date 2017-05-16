/*
 * Created by Thomas Boulbes
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.*;

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
			int consecutive = 0;
			char[] arr = stdin.readLine().toCharArray();
			IntStream.range(0, arr.length - 1).forEach(j -> {
				char v1 = arr[j];
				char v2 = arr[j + 1];
				if ((v1==v2) && (v1=='1')) consecutive++;
			});
		}
		stdout.flush();
		stdout.close();
	}
}
