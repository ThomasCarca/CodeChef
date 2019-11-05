import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    private static Stream<Arguments> countMaximumWeaponsProvider() {
        return Stream.of(
                Arguments.of(Arrays.asList("1111111111", "1111111111"), 0),
                Arguments.of(Arrays.asList("0000000000", "0000000000"), 0),
                Arguments.of(Arrays.asList("1111111111", "1111111110"), 1),
                Arguments.of(Arrays.asList("1111111111", "1111111100"), 2),
                Arguments.of(Arrays.asList("1111111111", "1111111101"), 1),
                Arguments.of(Arrays.asList("1111111011", "1111111100"), 3),
                Arguments.of(Arrays.asList("1111111001", "1111111100"), 2),
                Arguments.of(Arrays.asList("1111100111", "0111111110"), 4),
                Arguments.of(Arrays.asList("0000000000", "0000000000", "0000000001"), 1),
                Arguments.of(Arrays.asList("1111000000", "0110000000", "1001000001"), 1),
                Arguments.of(Arrays.asList("1111100000", "0110100000", "1001100001"), 2),
                Arguments.of(Arrays.asList("1110001101", "1010101011", "0000000011"), 4)
        );
    }

    @ParameterizedTest
    @MethodSource("countMaximumWeaponsProvider")
    void testCountMaximumWeapons(List<String> values, int expected) {
        assertEquals(expected, Main.countMaxWeapons(values));
    }

}
