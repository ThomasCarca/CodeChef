/*
 * Created by Thomas Boulbes
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {
	
	/**
	 * Log 2 nlz.
	 *
	 * @param bits the bits
	 * @return the int
	 */
	public static int log2nlz( int bits )
	{
	    if( bits == 0 )
	        return 0; // or throw exception
	    return 31 - Integer.numberOfLeadingZeros( bits );
	}
	
	/**
	 * Pow.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the double
	 */
	public static double pow(double a, int b) {
	    double result = 1;
	    while(b > 0) {
	        if (b % 2 != 0) {
	            result *= a;
	            b--;
	        } 
	        a *= a;
	        b /= 2;
	    }

	    return result;

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
		while (T-->0) {
			int n = sc.nextInt(), res = 0;
			while (n != 0) {
				int power = log2nlz(n);
				if (power >= 12) {
					n -= 2048;
				} else {
					n -= pow(2, power);
				}
				res += 1;
			}
			stdout.println(res);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}

}