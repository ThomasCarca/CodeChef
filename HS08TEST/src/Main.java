import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

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