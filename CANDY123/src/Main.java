import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter stdout = new PrintWriter(System.out);
		int t = Integer.valueOf(stdin.readLine());
		for (int i = 0; i < t; i++) {
			String[] quantities = stdin.readLine().split(" ");
			int maxLimak = Integer.parseInt(quantities[0]);
			int maxBob = Integer.parseInt(quantities[1]);
			int numberTurnsLimak = (int) Math.sqrt(maxLimak);
			int numberTurnsBob = (int) (-1 + Math.sqrt(1+4*maxBob))/2;
			stdout.println(numberTurnsLimak > numberTurnsBob ? "Limak" : "Bob");
		}
		stdout.flush();
		stdout.close();
	}

}