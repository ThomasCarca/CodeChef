import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    private static Stream<Arguments> buildSequenceOfLengthProvider() {
        return Stream.of(
                Arguments.of(Collections.singletonList(0), 1),
                Arguments.of(Arrays.asList(0, 0), 2),
                Arguments.of(Arrays.asList(0, 0, 1), 3),
                Arguments.of(Arrays.asList(0, 0, 1, 0), 4),
                Arguments.of(Arrays.asList(0, 0, 1, 0, 2), 5),
                Arguments.of(Arrays.asList(0, 0, 1, 0, 2, 0), 6),
                Arguments.of(Arrays.asList(0, 0, 1, 0, 2, 0, 2, 2, 1), 9),
                Arguments.of(Arrays.asList(0, 0, 1, 0, 2, 0, 2, 2, 1, 6, 0, 5, 0, 2, 6, 5, 4, 0, 5, 3, 0), 21)
        );
    }

    @ParameterizedTest
    @MethodSource("buildSequenceOfLengthProvider")
    void testBuildSequenceOfLength(List<Integer> expected, int length) {
        assertEquals(expected, Main.buildSequenceOfLength(length));
    }

    private static Stream<Arguments> countOccurrenceOfNumberAtPositionProvider() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(1, 3),
                Arguments.of(3, 4),
                Arguments.of(1, 5),
                Arguments.of(4, 6),
                Arguments.of(2, 9),
                Arguments.of(8, 21)
        );
    }

    @ParameterizedTest
    @MethodSource("countOccurrenceOfNumberAtPositionProvider")
    void testCountOccurrenceOfNumberAtPosition(int expected, int position) {
        assertEquals(expected, Main.countOccurrenceOfNumberAtPosition(position));
    }

}
