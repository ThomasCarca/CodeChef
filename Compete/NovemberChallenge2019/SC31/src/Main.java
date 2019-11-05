
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

    static int countMaxWeapons(List<String> players) {
        int maxWeapons = 0;
        for (int i = 0; i < 10 ; i++) {
            int playersHavingCurrentWeapon = 0;
            for (String player: players) {
                String weapon = player.substring(i, i + 1);
                playersHavingCurrentWeapon += Integer.parseInt(weapon);
            }
            if (playersHavingCurrentWeapon % 2 == 1)
                maxWeapons++;
        }
        return maxWeapons;
    }

    public static void main(String[] args) {
        FastReader rdr = new FastReader();
        PrintWriter stdout = new PrintWriter(System.out);
        int T = rdr.nextInt();
        while (T-- > 0) {
            int N = rdr.nextInt();
            List<String> players = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                players.add(rdr.nextLine());
            }
            stdout.println(countMaxWeapons(players));
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