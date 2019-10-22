
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

    private List<Integer> bankNotes;
    private int sweetPrice;
    private int totalMoney;

    Main(List<Integer> bankNotes, int sweetPrice) {
        this.bankNotes = bankNotes;
        this.sweetPrice = sweetPrice;
    }

    int getNumberOfWantedSweets() {
        calculateTotalMoney();
        if (isInadequate())
            return -1;
        return getNumberOfSweetsWith(totalMoney);
    }

    private void calculateTotalMoney() {
        int sum = 0;
        for (Integer bankNote : bankNotes) {
            sum += bankNote;
        }
        totalMoney = sum;
    }

    private boolean isInadequate() {
        return hasNotEnoughMoney() || isABankNoteRemaining();
    }

    private boolean hasNotEnoughMoney() {
        return totalMoney < sweetPrice;
    }

    private boolean isABankNoteRemaining() {
        for (Integer bankNote : bankNotes) {
            int numberOfSweets = getNumberOfSweetsWith(totalMoney);
            int numberOfSweetsMinusOneBankNote = getNumberOfSweetsWith(totalMoney - bankNote);
            if (numberOfSweetsMinusOneBankNote == numberOfSweets)
                return true;
        }
        return false;
    }

    private int getNumberOfSweetsWith(int money) {
        return money / sweetPrice;
    }

    public void main(String[] args) {
        FastReader rdr = new FastReader();
        PrintWriter stdout = new PrintWriter(System.out);
        int T = rdr.nextInt();
        while (T-- > 0) {
            int N = rdr.nextInt();
            sweetPrice = rdr.nextInt();
            bankNotes = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int bankNote = rdr.nextInt();
                bankNotes.add(bankNote);
            }
            Main main = new Main(bankNotes, sweetPrice);
            stdout.println(main.getNumberOfWantedSweets());
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