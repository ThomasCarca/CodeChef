import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int T = sc.nextInt();
		while (T-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt();
			stdout.print(Math.max(a, b) + " ");
			stdout.println(a + b);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}
 
} 