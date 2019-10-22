import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;


public class MainTest extends TestCase {

    public void test_number_is_inadequate_if_sum_of_bank_notes_is_lower_than_sweet_price() {
        List<Integer> bankNotes = new ArrayList<>();
        bankNotes.add(5);
        bankNotes.add(7);
        Main main = new Main(bankNotes, 15);
        int numberOfWantedSweets = main.getNumberOfWantedSweets();
        assertEquals(-1, numberOfWantedSweets);
    }

    public void test_number_of_sweets_is_one_if_sum_of_bank_notes_is_equal_to_sweet_price() {
        List<Integer> bankNotes = new ArrayList<>();
        bankNotes.add(6);
        bankNotes.add(11);
        bankNotes.add(17);
        Main main = new Main(bankNotes, 34);
        int numberOfWantedSweets = main.getNumberOfWantedSweets();
        assertEquals(1, numberOfWantedSweets);
    }

    public void test_number_of_sweets_is_more_than_one_if_sum_of_bank_notes_is_higher_than_sweet_price() {
        List<Integer> bankNotes = new ArrayList<>();
        bankNotes.add(5);
        bankNotes.add(20);
        bankNotes.add(5);
        Main main = new Main(bankNotes, 5);
        int numberOfWantedSweets = main.getNumberOfWantedSweets();
        assertEquals(6, numberOfWantedSweets);

        bankNotes = new ArrayList<>();
        bankNotes.add(15);
        bankNotes.add(5);
        bankNotes.add(7);
        main = new Main(bankNotes, 5);
        numberOfWantedSweets = main.getNumberOfWantedSweets();
        assertEquals(5, numberOfWantedSweets);
    }

    public void test_is_inadequate_if_a_bank_note_remains() {
        List<Integer> bankNotes = new ArrayList<>();
        bankNotes.add(10);
        bankNotes.add(4);
        bankNotes.add(8);
        bankNotes.add(5);
        Main main = new Main(bankNotes, 7);
        int numberOfWantedSweets = main.getNumberOfWantedSweets();
        assertEquals(-1, numberOfWantedSweets);

        bankNotes = new ArrayList<>();
        bankNotes.add(4);
        bankNotes.add(10);
        bankNotes.add(8);
        bankNotes.add(5);
        main = new Main(bankNotes, 7);
        numberOfWantedSweets = main.getNumberOfWantedSweets();
        assertEquals(-1, numberOfWantedSweets);

        bankNotes = new ArrayList<>();
        bankNotes.add(8);
        bankNotes.add(10);
        bankNotes.add(4);
        bankNotes.add(5);
        main = new Main(bankNotes, 7);
        numberOfWantedSweets = main.getNumberOfWantedSweets();
        assertEquals(-1, numberOfWantedSweets);
    }


}
