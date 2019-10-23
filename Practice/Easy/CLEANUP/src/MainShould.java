import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.AssertJUnit.*;


public class MainShould {

    @Test
    public void find_remaining_jobs_in_increasing_order() {
        List<Integer> jobsDone = Arrays.asList(2, 4, 1);
        int numberOfTotalJobs = 6;
        Main main = new Main(numberOfTotalJobs, jobsDone);
        List<Integer> expectedRemainingJobs = Arrays.asList(3, 5, 6);
        assertEquals(expectedRemainingJobs, main.findRemainingJobsInIncreasingOrder());

        jobsDone = Arrays.asList(4, 5, 6);
        numberOfTotalJobs = 6;
        main = new Main(numberOfTotalJobs, jobsDone);
        expectedRemainingJobs = Arrays.asList(1, 2, 3);
        assertEquals(expectedRemainingJobs, main.findRemainingJobsInIncreasingOrder());


        jobsDone = Arrays.asList(2, 3, 6);
        numberOfTotalJobs = 6;
        main = new Main(numberOfTotalJobs, jobsDone);
        expectedRemainingJobs = Arrays.asList(1, 4, 5);
        assertEquals(expectedRemainingJobs, main.findRemainingJobsInIncreasingOrder());
    }

    @Test
    public void print_no_jobs_if_all_has_been_done() {
        List<Integer> jobsDone = Arrays.asList(2, 3, 1);
        int numberOfTotalJobs = 3;
        Main main = new Main(numberOfTotalJobs, jobsDone);
        List<Integer> remainingJobs = Collections.emptyList();
        main.setRemainingJobs(remainingJobs);
        List<Integer> chefJobs = Collections.emptyList();
        List<Integer> assistantJobs = Collections.emptyList();
        assertArrayEquals(new List[]{chefJobs, assistantJobs}, main.getJobRepartitionForRemainingJobs());
    }

    @Test
    public void print_chef_and_assistant_jobs() {
        List<Integer> jobsDone = Arrays.asList(1, 4, 6, 2);
        int numberOfTotalJobs = 8;
        Main main = new Main(numberOfTotalJobs, jobsDone);
        List<Integer> remainingJobs = Arrays.asList(3, 5, 7, 8);
        main.setRemainingJobs(remainingJobs);
        List<Integer> expectedChefJobs = Arrays.asList(3, 7);
        List<Integer> expectedAssistantJobs = Arrays.asList(5, 8);
        List actualChefJobs = main.getJobRepartitionForRemainingJobs()[0];
        List actualAssistantJobs = main.getJobRepartitionForRemainingJobs()[1];
        assertEquals(expectedChefJobs, actualChefJobs);
        assertEquals(expectedAssistantJobs, actualAssistantJobs);

        jobsDone = Arrays.asList(1, 2, 3, 4);
        numberOfTotalJobs = 8;
        main = new Main(numberOfTotalJobs, jobsDone);
        remainingJobs = Arrays.asList(5, 6, 7, 8);
        main.setRemainingJobs(remainingJobs);
        expectedChefJobs = Arrays.asList(5, 7);
        expectedAssistantJobs = Arrays.asList(6, 8);
        actualChefJobs = main.getJobRepartitionForRemainingJobs()[0];
        actualAssistantJobs = main.getJobRepartitionForRemainingJobs()[1];
        assertEquals(expectedChefJobs, actualChefJobs);
        assertEquals(expectedAssistantJobs, actualAssistantJobs);

        jobsDone = Arrays.asList(1, 2, 3, 4, 10, 11, 12);
        numberOfTotalJobs = 14;
        main = new Main(numberOfTotalJobs, jobsDone);
        remainingJobs = Arrays.asList(5, 6, 7, 8, 9, 13, 14);
        main.setRemainingJobs(remainingJobs);
        expectedChefJobs = Arrays.asList(5, 7, 9, 14);
        expectedAssistantJobs = Arrays.asList(6, 8, 13);
        actualChefJobs = main.getJobRepartitionForRemainingJobs()[0];
        actualAssistantJobs = main.getJobRepartitionForRemainingJobs()[1];
        assertEquals(expectedChefJobs, actualChefJobs);
        assertEquals(expectedAssistantJobs, actualAssistantJobs);
    }

}
