
/*
 * Created by Thomas Boulbes
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static String formattedListWithoutMedian(int[] list) {
        int max = findMax(list);
        int min = findMin(list);
        List<Integer> listWithoutMedian = new ArrayList<Integer>();
        for (int i = 0; i < list.length; i++) {
            if (isValueMinOrMax(list[i], min, max))
                listWithoutMedian.add(list[i]);
        }
        String formattedListWithoutMedian = listWithoutMedian.get(0) + " " + listWithoutMedian.get(1);
        return formattedListWithoutMedian;
    }

    private static int findMin(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    private static int findMax(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    private static boolean isValueMinOrMax(int value, int min, int max) {
        return value == min || value == max;
    }

    public static void main(String[] args) {
        FastReader rdr = new FastReader();
        PrintWriter stdout = new PrintWriter(System.out);
        int T = rdr.nextInt();
        while (T-- > 0) {
            int N = rdr.nextInt();
            int[] list = new int[N];
            for (int i = 0; i < N; i++) {
                int A = rdr.nextInt();
                list[i] = A;
            }
            stdout.println(Main.formattedListWithoutMedian(list));
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