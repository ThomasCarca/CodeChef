import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		stdout.println();
		int T = sc.nextInt();
		while (T-->0) {
			String a = sc.nextInt()+"";
			int res = 0;
			for (int i = 0; i < a.length(); i++) {
				res += Integer.parseInt(a.substring(i, i+1));
			}
			stdout.println(res);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}