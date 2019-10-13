
/*
 * Created by Thomas Boulbes
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int solve(int N, List<Integer> P) {
        return countGoodPricesNumber(P, 0, 0);
    }

    private static int countGoodPricesNumber(List<Integer> P, int index, int goodPricesNumber) {
        if (index >= P.size())
            return goodPricesNumber;
        boolean isNumberAtIndexSmallerThanPreviousFive = isNumberAtIndexSmallerThanPreviousFive(P, index);
        return countGoodPricesNumber(P, index + 1, isNumberAtIndexSmallerThanPreviousFive ? goodPricesNumber + 1 : goodPricesNumber);
    }

    private static boolean isNumberAtIndexSmallerThanPreviousFive(List<Integer> P, int index) {
        return isNumberAtIndexSmallerThanPreviousFive(P, index, 1, true);
    }

    private static boolean isNumberAtIndexSmallerThanPreviousFive(List<Integer> P, int index, int incrementalIndex, boolean isNumberAtIndexSmallerThanPreviousFive) {
        int previousIndex = index - incrementalIndex;
        if (previousIndex < 0 || incrementalIndex > 5) {
            return isNumberAtIndexSmallerThanPreviousFive;
        }
        boolean isNumberAtIndexSmallerThanPrevious = P.get(index) < P.get(previousIndex);
        return isNumberAtIndexSmallerThanPreviousFive(P, index, incrementalIndex + 1, isNumberAtIndexSmallerThanPreviousFive && isNumberAtIndexSmallerThanPrevious);

    }

    public static void main(String[] args) {
        FastReader rdr = new FastReader();
        PrintWriter stdout = new PrintWriter(System.out);
        int T = rdr.nextInt();
        while (T-- > 0) {
            int N = rdr.nextInt();
            List<Integer> P = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                P.add(rdr.nextInt());
            }
            stdout.println(solve(N, P));
        }
        stdout.flush();
        stdout.close();

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