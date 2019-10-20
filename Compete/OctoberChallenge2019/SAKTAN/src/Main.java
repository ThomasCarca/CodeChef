
/*
 * Created by Thomas Boulbes
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static int countOddNumbers(int[][] matrix) {
        return 0;
    }

    public static void main(String[] args) {
        FastReader rdr = new FastReader();
        PrintWriter stdout = new PrintWriter(System.out);
        int T = rdr.nextInt();
        while (T-- > 0) {
            int N = rdr.nextInt(), M = rdr.nextInt(), Q = rdr.nextInt();
            int[][] matrix = new int[N][M];
            for (int i = 0; i < Q; i++) {
                int X = rdr.nextInt();
                int Y = rdr.nextInt();
                performOperationOnMatrix(matrix, X, Y);
            }
            stdout.println(countOddNumbers(matrix));
        }
        stdout.flush();
        stdout.close();

    }

    public static void performOperationOnMatrix(int[][] matrix, int X, int Y) {
        if (matrix.length > 1) {
            if (X == 1) {
                matrix[0][0] += 1;
                matrix[0][1] += 1;
            }
            if (X == 2) {
                matrix[1][1] += 1;
                matrix[1][0] += 1;
            }
            if (Y == 1) {
                matrix[0][0] += 1;
                matrix[1][0] += 1;
            }
            if (Y == 2) {
                matrix[0][1] += 1;
                matrix[1][1] += 1;
            }
        } else {
            matrix[0][0] += 2;
        }
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