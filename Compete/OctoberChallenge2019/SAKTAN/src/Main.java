
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

    static long countOddNumbers(int[][] matrix) {
        long oddNumbers = 0L;
        for (int[] row : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                oddNumbers += row[j] % 2 == 1 ? 1 : 0;
            }
        }
        return oddNumbers;
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

    static void performOperationOnMatrix(int[][] matrix, int X, int Y) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[X - 1][i] += 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][Y - 1] += 1;
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