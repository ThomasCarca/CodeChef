import junit.framework.TestCase;
import static org.junit.Assert.*;


public class MainTest extends TestCase {

    public void testOperationIsPerformedOn1x1Matrix() {
        int[][] actualMatrix = new int[1][1];

        Main.performOperationOnMatrix(actualMatrix, 1, 1);
        assertEquals(2, actualMatrix[0][0]);


        Main.performOperationOnMatrix(actualMatrix, 1, 1);
        assertEquals(4, actualMatrix[0][0]);

        Main.performOperationOnMatrix(actualMatrix, 1, 1);
        assertEquals(6, actualMatrix[0][0]);
    }

    public void testSameOperationIsPerformedOn2x2Matrix() {
        int[][] actualMatrix = new int[2][2];

        int[][] expectedMatrix = new int[][]{{2, 1},
                                             {1, 0}};

        Main.performOperationOnMatrix(actualMatrix, 1, 1);
        assertArrayEquals(expectedMatrix, actualMatrix);

        expectedMatrix = new int[][]{{4, 2},
                                     {2, 0}};

        Main.performOperationOnMatrix(actualMatrix, 1, 1);
        assertArrayEquals(expectedMatrix, actualMatrix);

        expectedMatrix = new int[][]{{6, 3},
                                     {3, 0}};

        Main.performOperationOnMatrix(actualMatrix, 1, 1);
        assertArrayEquals(expectedMatrix, actualMatrix);
    }

    public void testBottomLeftOperationIsPerformedOn2x2Matrix() {
        int[][] actualMatrix = new int[2][2];

        int[][] expectedMatrix = new int[][]{{1, 0},
                                             {2, 1}};

        Main.performOperationOnMatrix(actualMatrix, 2, 1);
        assertArrayEquals(expectedMatrix, actualMatrix);

        expectedMatrix = new int[][]{{2, 0},
                                     {4, 2}};


        Main.performOperationOnMatrix(actualMatrix, 2, 1);
        assertArrayEquals(expectedMatrix, actualMatrix);

    }

    public void testTopRightOperationIsPerformedOn2x2Matrix() {
        int[][] actualMatrix = new int[2][2];

        int[][] expectedMatrix = new int[][]{{1, 2},
                                             {0, 1}};

        Main.performOperationOnMatrix(actualMatrix, 1, 2);
        assertArrayEquals(expectedMatrix, actualMatrix);

        expectedMatrix = new int[][]{{2, 4},
                                     {0, 2}};

        Main.performOperationOnMatrix(actualMatrix, 1, 2);
        assertArrayEquals(expectedMatrix, actualMatrix);
    }

    public void testBottomRightOperationIsPerformedOn2x2Matrix() {
        int[][] actualMatrix = new int[2][2];

        int[][] expectedMatrix = new int[][]{{0, 1},
                                             {1, 2}};

        Main.performOperationOnMatrix(actualMatrix, 2, 2);
        assertArrayEquals(expectedMatrix, actualMatrix);

        expectedMatrix = new int[][]{{0, 2},
                                     {2, 4}};

        Main.performOperationOnMatrix(actualMatrix, 2, 2);
        assertArrayEquals(expectedMatrix, actualMatrix);
    }

    public void testTopLeftOperationIsPerformedOn2x2Matrix() {
        int[][] actualMatrix = new int[2][2];

        int[][] expectedMatrix = new int[][]{{2, 1},
                                             {1, 0}};

        Main.performOperationOnMatrix(actualMatrix, 1, 1);
        assertArrayEquals(expectedMatrix, actualMatrix);

        expectedMatrix = new int[][]{{4, 2},
                                     {2, 0}};

        Main.performOperationOnMatrix(actualMatrix, 1, 1);
        assertArrayEquals(expectedMatrix, actualMatrix);
    }

    public void testOperationIsPerformedOn3x3Matrix() {
        int[][] actualMatrix = new int[3][3];
        int[][] expectedMatrix = new int[][]{{1, 2, 1},
                                             {0, 1, 0},
                                             {0, 1, 0}};

        Main.performOperationOnMatrix(actualMatrix, 1, 2);
        assertArrayEquals(expectedMatrix, actualMatrix);

        expectedMatrix = new int[][]{{2, 2, 1},
                                     {2, 2, 1},
                                     {1, 1, 0}};

        Main.performOperationOnMatrix(actualMatrix, 2, 1);
        assertArrayEquals(expectedMatrix, actualMatrix);

        expectedMatrix = new int[][]{{4, 3, 2},
                                     {3, 2, 1},
                                     {2, 1, 0}};

        Main.performOperationOnMatrix(actualMatrix, 1, 1);
        assertArrayEquals(expectedMatrix, actualMatrix);

    }

    public void testOperationIsPerformedOn2x3Matrix() {
        int[][] actualMatrix = new int[2][3];
        int[][] expectedMatrix = new int[][]{{1, 2, 1},
                                             {0, 1, 0}};

        Main.performOperationOnMatrix(actualMatrix, 1, 2);
        assertArrayEquals(expectedMatrix, actualMatrix);
    }


}
