import junit.framework.TestCase;


public class MainTest extends TestCase {

    public void testFormatBooleanReturnsYes(){
        assertEquals("Yes", Main.formatBoolean(true));
    }

    public void testFormatBooleanReturnsNo(){
        assertEquals("No", Main.formatBoolean(false));
    }

    public void testSequenceExistsIfNoCheatHasToBeApplied() {
        Boolean sequenceExists = Main.sequenceExistsForAmount(1L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));
    }

    public void testSequenceExistsIfOnlyTheFirstCheatHasToBeApplied() {
        Boolean sequenceExists = Main.sequenceExistsForAmount(10L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(100L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(1000L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));
    }

    public void testSequenceExistsIfOnlyTheSecondCheatHasToBeApplied() {
        Boolean sequenceExists = Main.sequenceExistsForAmount(20L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(400L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(8000L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));
    }


    public void testSequenceExistsIfBothCheatsHaveToBeAppliedThe() {
        Boolean sequenceExists = Main.sequenceExistsForAmount(200L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(40000L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(64000000L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(64000000000L);
        assertEquals("Yes", Main.formatBoolean(sequenceExists));
    }


    public void testSequenceDoesNotExist() {
        Boolean sequenceExists = Main.sequenceExistsForAmount(90L);
        assertEquals("No", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(5L);
        assertEquals("No", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(9L);
        assertEquals("No", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(1024000000000L);
        assertEquals("No", Main.formatBoolean(sequenceExists));

        sequenceExists = Main.sequenceExistsForAmount(1024L);
        assertEquals("No", Main.formatBoolean(sequenceExists));
    }

}
