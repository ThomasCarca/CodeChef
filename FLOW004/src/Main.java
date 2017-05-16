import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int T = Integer.parseInt(sc.nextLine().trim());
		while (T-- > 0) {
			String value = sc.nextLine();
			int len = value.length();
			stdout.println(Integer.parseInt(value.substring(0,1)) + Integer.parseInt(value.substring(len-1, len)));
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}