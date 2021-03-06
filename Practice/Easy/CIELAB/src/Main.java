
/*
 * Created by Thomas Boulbes
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

// TODO: Auto-generated Javadoc

/**
 * The Class Main.
 */
public class Main {

    static int solve(int A, int B) {
        int diff = A-B;
        return diff % 10 == 9 ? diff-1 : diff+1;
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
        int A = rdr.nextInt(), B = rdr.nextInt();
        stdout.println(solve(A, B));
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