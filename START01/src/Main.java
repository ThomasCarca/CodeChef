import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		stdout.print(sc.nextInt());
		sc.close();
		stdout.flush();
		stdout.close();
	}

}