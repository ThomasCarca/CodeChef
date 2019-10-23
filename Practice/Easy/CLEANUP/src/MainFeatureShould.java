import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainFeatureShould {

    @Test
    public void find_remaining_jobs_and_print_the_repartition_between_chef_and_assistant() {
        List<Integer> jobsDone = Arrays.asList(2, 4, 1);
        int numberOfTotalJobs = 6;
        Main main = new Main(numberOfTotalJobs, jobsDone);
        main.findRemainingJobsInIncreasingOrder();
        List[] printedRepartition = main.getJobRepartitionForRemainingJobs();
        List<Integer> chefJobs = Arrays.asList(3, 6);
        List<Integer> assistantJobs = Collections.singletonList(5);
        assertArrayEquals(new List[]{chefJobs, assistantJobs}, printedRepartition);
    }
}
