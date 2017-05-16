import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			BigDecimal value = new BigDecimal(sc.nextInt());		
			int trailingZeros = 0;
			while (value.divide(new BigDecimal("5")).compareTo(new BigDecimal("1")) == 1 || value.divide(new BigDecimal("5")).compareTo(new BigDecimal("1")) == 0) {
				trailingZeros += value.divide(new BigDecimal("5")).intValue();
				value = value.divide(new BigDecimal("5"));
			}
			stdout.println(trailingZeros);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}

