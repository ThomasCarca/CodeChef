/*
 * Created by Thomas Boulbes
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * The Class Main.
 */
public class Main {

	/**
	 * Are all dividable.
	 *
	 * @param values the values
	 * @param div the div
	 * @return true, if successful
	 */
	public static boolean areAllDividable(List<Integer> values, int div) {
		int i = values.size() - 1;
		while (i >= 0 && values.get(i) % div == 0) {
			i--;
		}
		return i == -1;
	}
	
	/**
	 * Prints the result.
	 *
	 * @param values the values
	 * @param printer the printer
	 */
	public static void printResult(List<Integer> values, PrintWriter printer) {
		for (int i = 0; i < values.size(); i++) {
			printer.print(values.get(i));
			if (i != values.size()-1) printer.print(" ");
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			List<Integer> values = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				values.add(sc.nextInt());
			}
			int min = Collections.min(values);
			while (min > 1 && !areAllDividable(values, min)) {
				min--;
			}
			final int div = min;
			values = values.stream().map(i -> i/div).collect(Collectors.toList());
			printResult(values, stdout);
			if (T != 0) stdout.println();
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}