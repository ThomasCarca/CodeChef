import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static BigInteger[] compute(int max){
		BigInteger[] nFact = new BigInteger[max];
		//First value is 1! = 1.
		nFact[0] = new BigInteger("1");
		for (int i = 1; i < max; i++) {
			nFact[i] = nFact[i-1].multiply(new BigInteger(i+1+""));
		}
		return nFact;
	}
	
	public static void main(String[] args) throws IOException {
		//Initiazing I/O
		Scanner sc = new Scanner(System.in);
		PrintWriter stdout = new PrintWriter(System.out);
		//Getting number of inputs
		int n = sc.nextInt();
		List<Integer> values = new ArrayList<Integer>();
		//Store all the inputs in the list "values"
		for (int i = 0; i < n; i++) values.add(sc.nextInt());
		//Get the largest input using the max method from the Collections class.
		int max = Collections.max(values);
		//Call the compute method to get max! and store all steps in an array.
		BigInteger[] nFact = compute(max);
		//At that point we should have an array of that for; [1!, 2!, 3!, ..., (max-1)!, max!]
		//For example if we assume max = 100, and we want to get 74!, we should just access the array at the position (74-1)=73.
		for (int i = 0; i < n; i++) {
			//For each input, we retrieve its value from the list "values" and then get its factorial from the "nFact" array.
			stdout.println(nFact[values.get(i)-1]);
		}
		sc.close();
		stdout.flush();
		stdout.close();
	}
}


