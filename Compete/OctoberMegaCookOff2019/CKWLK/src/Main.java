
/*
 * Created by Thomas Boulbes
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastReader rdr = new FastReader();
        PrintWriter stdout = new PrintWriter(System.out);
        int T = rdr.nextInt();
        while (T-- > 0) {
            Long amount = rdr.nextLong();
            stdout.println(formatBoolean(sequenceExistsForAmount(amount)));
        }
        stdout.flush();
        stdout.close();

    }

    protected static String formatBoolean(boolean answer) {
        return answer ? "Yes" : "No";
    }

    protected static Boolean sequenceExistsForAmount(Long amount) {
        return isAmountComposedOf10And20(amount);
    }

    private static boolean isAmountComposedOf10And20(Long amount) {
        boolean isComposedOf20 = isAmountComposedOf20(amount);
        while (!isComposedOf20) {
            if (isNotDividableBy10(amount))
                return false;
            amount /= 10;
            isComposedOf20 = isAmountComposedOf20(amount);
        }
        return true;
    }

    private static boolean isNotDividableBy10(Long amount) {
        return amount % 10 != 0;
    }

    private static boolean isAmountComposedOfNumber(Long amount, int number) {
        Long remainder = amount;
        while (remainder >= number && remainder % number == 0) {
            remainder /= number;
        }
        return remainder == 1;
    }

    private static boolean isAmountComposedOf20(Long amount) {
        return isAmountComposedOfNumber(amount, 20);
    }

    //////////////////////////////////////////////////
    ////////////////// +--------+ ////////////////////
    ////////////////// | READER | ////////////////////
    ////////////////// +--------+ ////////////////////
    //////////////////////////////////////////////////

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        private FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}