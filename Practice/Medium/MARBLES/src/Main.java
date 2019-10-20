
/*
 * Created by Thomas Boulbes
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Stream;

// TODO: Auto-generated Javadoc

/**
 * The Class Main.
 */
public class Main {

    static Long solve(Map<Integer, Map<Integer, Long>> memoMarbles, int N, int K) {
        if (N == K || K == 1) return 1L;
        if (memoMarbles.get(N) == null) {
            memoMarbles.put(N, new HashMap<Integer, Long>());
        }
        if (memoMarbles.get(N).get(K) == null) {
            memoMarbles.get(N).put(K, solve(memoMarbles, N-1, K) + solve(memoMarbles, N-1, K-1));
        }
        return memoMarbles.get(N).get(K);
    }

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void main(String[] args) throws IOException {
        FastReader rdr = new FastReader();
        PrintWriter stdout = new PrintWriter(System.out);
        int T = rdr.nextInt();
        while (T-- > 0) {
            int N = rdr.nextInt(), K = rdr.nextInt();
            stdout.println(solve(new HashMap<Integer, Map<Integer, Long>>(), N, K));
        }
        stdout.flush();
        stdout.close();

    }

    //////////////////////////////////////////////////
    ////////////////// +--------+ ////////////////////
    ////////////////// | READER | ////////////////////
    ////////////////// +--------+ ////////////////////
    //////////////////////////////////////////////////

    /**
     * The Class FastReader.
     */
    static class FastReader {

        /**
         * The br.
         */
        BufferedReader br;

        /**
         * The st.
         */
        StringTokenizer st;

        /**
         * Instantiates a new fast reader.
         */
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        /**
         * Next.
         *
         * @return the string
         */
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

        /**
         * Next int.
         *
         * @return the int
         */
        int nextInt() {
            return Integer.parseInt(next());
        }

        /**
         * Next long.
         *
         * @return the long
         */
        long nextLong() {
            return Long.parseLong(next());
        }

        /**
         * Next double.
         *
         * @return the double
         */
        double nextDouble() {
            return Double.parseDouble(next());
        }

        /**
         * Next line.
         *
         * @return the string
         */
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