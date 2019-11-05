
/*
 * Created by Thomas Boulbes
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastReader rdr = new FastReader();
        PrintWriter stdout = new PrintWriter(System.out);
        int T = rdr.nextInt();
        while (T-- > 0) {
            int N = rdr.nextInt();
            stdout.println(countOccurrenceOfNumberAtPosition(N));
        }

        stdout.flush();
        stdout.close();

    }

    static List<Integer> buildSequenceOfLength(int length) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        for (int i = 1; i < length; i++) {
            int nextNumber = distanceBetweenLastNumberOfSequenceAndPreviousOccurrence(sequence);
            sequence.add(nextNumber);
        }
        return sequence;
    }

    private static int distanceBetweenLastNumberOfSequenceAndPreviousOccurrence(List<Integer> sequence) {
        int lastIndex = sequence.size() - 1;
        int lastNumber = sequence.get(lastIndex);
        for (int i = 1; i < sequence.size(); i++) {
            if (sequence.get(lastIndex-i) == lastNumber)
                return i;
        }
        return 0;
    }

    static int countOccurrenceOfNumberAtPosition(int position) {
        List<Integer> sequence = buildSequenceOfLength(position);
        int number = sequence.get(position-1);
        return sequence.stream().reduce(0, (soFar, current) -> soFar + (current == number ? 1 : 0));
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

        @SuppressWarnings("unused")
        int nextInt() {
            return Integer.parseInt(next());
        }

        @SuppressWarnings("unused")
        long nextLong() {
            return Long.parseLong(next());
        }

        @SuppressWarnings("unused")
        double nextDouble() {
            return Double.parseDouble(next());
        }

        @SuppressWarnings("unused")
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