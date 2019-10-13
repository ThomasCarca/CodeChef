import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainTest extends TestCase {

    public void testSolveWithOneSong() {
        expectSolveJohny(1, 1, 1, Collections.singletonList(4));
        expectSolveJohny(1, 1, 1, Collections.singletonList(7));
        expectSolveJohny(1, 1, 1, Collections.singletonList(15));
    }

    public void testSolveWithMultipleOrderedSong() {
        expectSolveJohny(2, 4, 2, Arrays.asList(2, 3, 4, 9));
        expectSolveJohny(4, 4, 4, Arrays.asList(8, 9, 14, 19));
    }

    public void testSolveWithMultipleUnorderedSong() {
        expectSolveJohny(1, 4, 3, Arrays.asList(9, 5, 3, 11));
        expectSolveJohny(3, 4, 1, Arrays.asList(10, 9, 11, 5));
        expectSolveJohny(5, 5, 3, Arrays.asList(7, 8, 11, 5, 2));
        expectSolveJohny(3, 4, 2, Arrays.asList(1, 3, 4, 2));
    }

    private void expectSolveJohny(int expected, int N, int K, List<Integer> A) {
        assertEquals(expected, Main.solve(N, A, K));
    }

}
