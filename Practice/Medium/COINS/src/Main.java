
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

    static Long solve(Map<Long, Long> memoCoin, Long coin) {
        if (coin < 12) {
            memoCoin.put(coin, coin);
        }
        if (memoCoin.get(coin) == null) {
            Long fourthOfCoin = solve(memoCoin, coin / 4);
            Long thirdOdCoin = solve(memoCoin, coin / 3);
            Long halfOfCoin = solve(memoCoin, coin / 2);
            memoCoin.put(coin, fourthOfCoin + thirdOdCoin + halfOfCoin);
        }
        return memoCoin.get(coin);
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
        try {
            int coin;
            while (true) {
                coin = rdr.nextInt();
                stdout.println(solve(new HashMap<Long, Long>(), new Long(coin)));
            }
        } catch (NullPointerException e) {
            stdout.flush();
            stdout.close();
        }

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