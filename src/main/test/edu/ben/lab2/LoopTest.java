package edu.ben.lab2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LoopTest {


    /**
     * How to do a single test in JUnit (you will likely prefer to use parameterized tests, as they will cover more cases)
     */
    @Test
    void testMyForLoopSingle() {
        int[] sampleOne = new int[]{1, 2, 3, 4, 5, 6};
        assert 1 == Loop.myForLoop(sampleOne);
    }

    /**
     * How to do a parameterized test in JUnit
     *
     * @param values   The array to send into the method being tested. This is passed via a methodSource
     * @param expected The result we expected to receive from the method being tested. This is passed via a methodSource
     */
    @ParameterizedTest
    @MethodSource("myForLoopArgs")
    void testMyForLoopParameterized(int[] values, int expected) {
        assert expected == Loop.myForLoop(values);
    }

    /**
     * This method is referenced by name in the @MethodSource tag
     *
     * @return A stream of argument sets to pass into a test method
     */
    private static Stream<Arguments> myForLoopArgs() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 1),
                Arguments.of(new int[]{20, 25, 30, 60}, 4),
                Arguments.of(new int[]{1}, 0)
        );
    }

    // END myForLoop tests

    // START myEnhancedForLoop tests
    @ParameterizedTest
    @MethodSource("myEnhancedForLoopArgs")
    void testMyEnhancedForLoop(int[] values, int expected) {
        assert expected == Loop.myEnhancedForLoop(values);
    }

    private static Stream<Arguments> myEnhancedForLoopArgs() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 2),
                Arguments.of(new int[]{20, 25, 30, 60}, 2),
                Arguments.of(new int[]{1}, 0)
        );
    }

    // END myEnhancedForLoop tests

    // START myWhileLoop tests
    @ParameterizedTest
    @MethodSource("myWhileLoopArgs")
    void testMyWhileLoop(int[] values, int expected) {
        assert expected == Loop.myWhileLoop(values);
    }

    private static Stream<Arguments> myWhileLoopArgs() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 15),
                Arguments.of(new int[]{20, 25, 30, 60}, 75),
                Arguments.of(new int[]{1}, 0)
        );
    }

    // END myWhileLoop tests
}
