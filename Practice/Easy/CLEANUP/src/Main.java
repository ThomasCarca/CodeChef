
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
import java.util.stream.Collectors;

public class Main {

    private static final int CHEF_INITIAL_JOB_POSITION = 0;
    private static final int ASSISTANT_INITIAL_JOB_POSITION = 1;
    private int numberOfTotalJobs;
    private List<Integer> jobsDone;
    private List<Integer> remainingJobs;
    private List<Integer> chefJobs;
    private List<Integer> assistantJobs;

    Main(int numberOfTotalJobs, List<Integer> jobsDone) {
        this.numberOfTotalJobs = numberOfTotalJobs;
        this.jobsDone = jobsDone;
    }

    List<Integer> findRemainingJobsInIncreasingOrder() {
        remainingJobs = new ArrayList<>();
        for (int job = 1; job <= numberOfTotalJobs; job++) {
            addJobIndexToRemainingJobsIfJobNotDone(job);
        }
        return remainingJobs;
    }

    List[] getJobRepartitionForRemainingJobs() {
        initializeChefAndAssistantJobs();
        if (someRemainingJobs()) {
            getJobRepartitionForChefAndAssistant();
        }
        return new List[]{chefJobs, assistantJobs};
    }

    private void getJobRepartitionForChefAndAssistant() {
        getJobRepartitionFor(chefJobs, CHEF_INITIAL_JOB_POSITION);
        getJobRepartitionFor(assistantJobs, ASSISTANT_INITIAL_JOB_POSITION);
    }

    private void getJobRepartitionFor(List<Integer> SomeonesJobs, int initialJobPosition) {
        for (int jobPosition = initialJobPosition; jobPosition < remainingJobs.size(); jobPosition += 2) {
            Integer job = remainingJobs.get(jobPosition);
            SomeonesJobs.add(job);
        }
    }

    private boolean someRemainingJobs() {
        return !remainingJobs.isEmpty();
    }

    private void initializeChefAndAssistantJobs() {
        initializeChefJobs();
        initializeAssistantJobs();
    }

    private void initializeAssistantJobs() {
        assistantJobs = new ArrayList<>();
    }

    private void initializeChefJobs() {
        chefJobs = new ArrayList<>();
    }

    private void addJobIndexToRemainingJobsIfJobNotDone(int jobIndex) {
        if (!jobsDone.contains(jobIndex)) {
            addJobIndexToRemainingJobs(jobIndex);
        }
    }

    private void addJobIndexToRemainingJobs(int jobIndex) {
        remainingJobs.add(jobIndex);
    }

    private String formatJobs(List<Integer> jobs) {
        return jobs.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }


    void setRemainingJobs(List<Integer> remainingJobs) {
        this.remainingJobs = remainingJobs;
    }

    public static void main(String[] args) {
        FastReader rdr = new FastReader();
        PrintWriter stdout = new PrintWriter(System.out);
        int T = rdr.nextInt();
        while (T-- > 0) {
            int numberOfTotalJobs = rdr.nextInt(), numberOfJobsDone = rdr.nextInt();
            List<Integer> jobsDone = new ArrayList<>();
            for (int i = 0; i < numberOfJobsDone ; i++) {
                int job = rdr.nextInt();
                jobsDone.add(job);
            }
            Main main = new Main(numberOfTotalJobs, jobsDone);
            main.findRemainingJobsInIncreasingOrder();
            List[] jobRepartition = main.getJobRepartitionForRemainingJobs();
            List<Integer> chefJobs = jobRepartition[0];
            List<Integer> assistantJobs = jobRepartition[1];
            stdout.println(main.formatJobs(chefJobs));
            stdout.println(main.formatJobs(assistantJobs));
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