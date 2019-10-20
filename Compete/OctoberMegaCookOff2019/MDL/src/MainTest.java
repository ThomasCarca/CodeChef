import junit.framework.TestCase;

import java.util.Arrays;


public class MainTest extends TestCase {

    public void testFindMedianWithOrderedList() {
        assertEquals("2 8", Main.formattedListWithoutMedian(new int[]{2, 4, 8}));
        assertEquals("3 10", Main.formattedListWithoutMedian(new int[]{3, 6, 10}));
        assertEquals("8 14", Main.formattedListWithoutMedian(new int[]{8, 12, 14}));

        assertEquals("8 25", Main.formattedListWithoutMedian(new int[]{8, 12, 14, 25}));
        assertEquals("11 48", Main.formattedListWithoutMedian(new int[]{11, 12, 15, 48}));
        assertEquals("1 8", Main.formattedListWithoutMedian(new int[]{1, 2, 5, 8}));

        assertEquals("8 25", Main.formattedListWithoutMedian(new int[]{8, 12, 12, 14, 25}));
        assertEquals("11 48", Main.formattedListWithoutMedian(new int[]{11, 12, 13, 15, 48}));
        assertEquals("1 8", Main.formattedListWithoutMedian(new int[]{1, 2, 5, 7, 8}));
    }

    public void testFindMedianWithUnorderedList() {
        assertEquals("5 2", Main.formattedListWithoutMedian(new int[]{4, 5, 2}));
        assertEquals("12 1", Main.formattedListWithoutMedian(new int[]{12, 4, 1, 2}));
        assertEquals("2 32", Main.formattedListWithoutMedian(new int[]{26, 2, 7, 32, 18}));
    }

}
