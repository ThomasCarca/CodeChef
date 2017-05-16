import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int score = 0;
		for (int i = 0; i < n; i++) {
			if (sc.nextInt()%k == 0) score++;
		}
		stdout.print(score);
		sc.close();
		stdout.flush();
		stdout.close();
	}

}