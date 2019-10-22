import junit.framework.TestCase;

import static junit.framework.Assert.assertEquals;

public class MainFeature extends TestCase {


    public void testCountOddNumbersOnSquareMatrix() {
        int[][] matrix = new int[5][5];

        Main.performOperationOnMatrix(matrix, 1, 1);
        Main.performOperationOnMatrix(matrix, 5, 5);
        Main.performOperationOnMatrix(matrix, 3, 1);

        // 3 1 1 1 2
        // 2 0 0 0 1
        // 3 1 1 1 2
        // 2 0 0 0 1
        // 3 1 1 1 2
        assertEquals(14L, Main.countOddNumbers(matrix));
    }

    public void testCountOddNumbersOnRectangleMatrix() {
        int[][] matrix = new int[2][5];

        Main.performOperationOnMatrix(matrix, 1, 5);
        Main.performOperationOnMatrix(matrix, 2, 3);
        Main.performOperationOnMatrix(matrix, 2, 1);


        // 2 1 2 1 2
        // 3 2 3 2 3
        assertEquals(5L, Main.countOddNumbers(matrix));
    }

}
