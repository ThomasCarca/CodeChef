import junit.framework.TestCase;

import java.util.Arrays;


public class MainTest extends TestCase {

    public void testSolveWith7Days() {
        assertEquals(2, Main.solve(7, Arrays.asList(375, 750, 723, 662, 647, 656, 619)));

        assertEquals(1, Main.solve(7, Arrays.asList(375, 750, 723, 662, 647, 656, 700)));
        assertEquals(1, Main.solve(7, Arrays.asList(375, 750, 723, 662, 647, 656, 648)));

        assertEquals(2, Main.solve(7, Arrays.asList(460, 470, 480, 490, 500, 400, 520)));

        assertEquals(2, Main.solve(7, Arrays.asList(460, 470, 480, 490, 400, 500, 510)));

        assertEquals(2, Main.solve(7, Arrays.asList(460, 470, 480, 400, 500, 510, 520)));

        assertEquals(2, Main.solve(7, Arrays.asList(460, 470, 400, 480, 500, 510, 520)));

        assertEquals(2, Main.solve(7, Arrays.asList(460, 400, 470, 480, 500, 510, 520)));

        assertEquals(3, Main.solve(7, Arrays.asList(460, 450, 440, 480, 500, 510, 520)));

        assertEquals(7, Main.solve(7, Arrays.asList(460, 450, 440, 430, 420, 410, 400)));

    }

    public void testSolveWithMoreThan7Days() {
        assertEquals(2, Main.solve(10, Arrays.asList(460, 400, 470, 480, 500, 510, 520, 530, 540, 550)));

        assertEquals(2, Main.solve(13, Arrays.asList(460, 465, 470, 480, 400, 510, 520, 530, 540, 550, 560, 570, 580)));

        assertEquals(7, Main.solve(13, Arrays.asList(500, 490, 480, 500, 420, 510, 410, 400, 550, 600, 700, 710, 390)));
    }

}
