
/*
 * Created by Thomas Boulbes
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static int solve(int N, List<Integer> A, int K) {
        boolean isOrdered = isOrdered(A, true);
        if (!isOrdered) {
            return findJohnySongIndex(A, K);
        }
        if (A.size() > 1)
            return K;
        return 1;
    }

    private static int findJohnySongIndex(List<Integer> A, int K) {
        int johnySong = A.get(K - 1);
        orderSongList(A);
        return A.indexOf(johnySong) + 1;
    }

    private static void orderSongList(List<Integer> A) {
        A.sort(Comparator.naturalOrder());
    }

    private static boolean isOrdered(List<Integer> A, boolean isOrdered) {
        if (A.size() == 1)
            return isOrdered;
        return isOrdered && isOrdered(tail(A), isCurrentSongLargerThanTheNext(A));

    }

    private static List<Integer> tail(List<Integer> A) {
        return A.subList(1, A.size());
    }

    private static boolean isCurrentSongLargerThanTheNext(List<Integer> A) {
        return A.get(0) < A.get(1);
    }

    public static void main(String[] args) {
        FastReader rdr = new FastReader();
        PrintWriter stdout = new PrintWriter(System.out);
        int T = rdr.nextInt();
        while (T-- > 0) {
            int N = rdr.nextInt();
            List<Integer> A = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                A.add(rdr.nextInt());
            }
            int K = rdr.nextInt();
            stdout.println(solve(N, A, K));
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