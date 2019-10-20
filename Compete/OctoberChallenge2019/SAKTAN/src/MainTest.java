import junit.framework.TestCase;


public class MainTest extends TestCase {

    public void testOperationIsPerformedOn1x1Matrix() {
        int[][] matrix = new int[1][1];

        Main.performOperationOnMatrix(matrix, 1, 1);
        assertEquals(2, matrix[0][0]);


        Main.performOperationOnMatrix(matrix, 1, 1);
        assertEquals(4, matrix[0][0]);

        Main.performOperationOnMatrix(matrix, 1, 1);
        assertEquals(6, matrix[0][0]);
    }

    public void testSameOperationIsPerformedOn2x2Matrix() {
        int[][] matrix = new int[2][2];

        Main.performOperationOnMatrix(matrix, 1, 1);
        assertEquals(1, matrix[1][0]);
        assertEquals(1, matrix[0][1]);
        assertEquals(2, matrix[0][0]);
        assertEquals(0, matrix[1][1]);

        Main.performOperationOnMatrix(matrix, 1, 1);
        assertEquals(2, matrix[1][0]);
        assertEquals(2, matrix[0][1]);
        assertEquals(4, matrix[0][0]);
        assertEquals(0, matrix[1][1]);

        Main.performOperationOnMatrix(matrix, 1, 1);
        assertEquals(3, matrix[1][0]);
        assertEquals(3, matrix[0][1]);
        assertEquals(6, matrix[0][0]);
        assertEquals(0, matrix[1][1]);
    }

    public void testBottomLeftOperationIsPerformedOn2x2Matrix() {
        int[][] matrix = new int[2][2];
        Main.performOperationOnMatrix(matrix, 2, 1);
        assertEquals(1, matrix[0][0]);
        assertEquals(2, matrix[1][0]);
        assertEquals(0, matrix[0][1]);
        assertEquals(1, matrix[1][1]);

        Main.performOperationOnMatrix(matrix, 2, 1);
        assertEquals(2, matrix[0][0]);
        assertEquals(4, matrix[1][0]);
        assertEquals(0, matrix[0][1]);
        assertEquals(2, matrix[1][1]);
    }

    public void testTopRightOperationIsPerformedOn2x2Matrix() {
        int[][] matrix = new int[2][2];
        Main.performOperationOnMatrix(matrix, 1, 2);
        assertEquals(1, matrix[0][0]);
        assertEquals(0, matrix[1][0]);
        assertEquals(2, matrix[0][1]);
        assertEquals(1, matrix[1][1]);

        Main.performOperationOnMatrix(matrix, 1, 2);
        assertEquals(2, matrix[0][0]);
        assertEquals(0, matrix[1][0]);
        assertEquals(4, matrix[0][1]);
        assertEquals(2, matrix[1][1]);
    }

    public void testBottomRightOperationIsPerformedOn2x2Matrix() {
        int[][] matrix = new int[2][2];
        Main.performOperationOnMatrix(matrix, 2, 2);
        assertEquals(0, matrix[0][0]);
        assertEquals(1, matrix[1][0]);
        assertEquals(1, matrix[0][1]);
        assertEquals(2, matrix[1][1]);

        Main.performOperationOnMatrix(matrix, 2, 2);
        assertEquals(0, matrix[0][0]);
        assertEquals(2, matrix[1][0]);
        assertEquals(2, matrix[0][1]);
        assertEquals(4, matrix[1][1]);
    }

    public void testTopLeftOperationIsPerformedOn2x2Matrix() {
        int[][] matrix = new int[2][2];
        Main.performOperationOnMatrix(matrix, 1, 1);
        assertEquals(2, matrix[0][0]);
        assertEquals(1, matrix[1][0]);
        assertEquals(1, matrix[0][1]);
        assertEquals(0, matrix[1][1]);

        Main.performOperationOnMatrix(matrix, 1, 1);
        assertEquals(4, matrix[0][0]);
        assertEquals(2, matrix[1][0]);
        assertEquals(2, matrix[0][1]);
        assertEquals(0, matrix[1][1]);
    }


}
