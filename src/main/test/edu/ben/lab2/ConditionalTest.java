package edu.ben.lab2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ConditionalTest {

    /**
     * How to do a single test in JUnit (you will likely prefer to use parameterized tests, as they will cover more cases)
     */
    @Test
    void testMyConditionalSingle() {
        assert "0".equals(Conditional.myConditional(0));
    }

    /**
     * How to do a parameterized test in JUnit
     *
     * @param argument The argument to send into the method being tested. This is passed via a methodSource
     * @param expected The result we expected to receive from the method being tested. This is passed via a methodSource
     */
    @ParameterizedTest
    @MethodSource("myConditionalArgs")
    void testMyConditionalParameterized(int argument, String expected) {
        assert expected.equals(Conditional.myConditional(argument));
    }

    /**
     * This method is referenced by name in the @MethodSource tag
     *
     * @return A stream of argument sets to pass into a test method
     */
    private static Stream<Arguments> myConditionalArgs() {
        return Stream.of(
                Arguments.of(-1, "Negative"),
                Arguments.of(0, "0"),
                Arguments.of(1, "Positive")
        );
    }

    // END myConditional Tests

    // START mySwitch Tests

    @ParameterizedTest
    @MethodSource("mySwitchArgs")
    void testMySwitch(int argument, String expected) {
        assert expected.equals(Conditional.mySwitch(argument));
    }

    private static Stream<Arguments> mySwitchArgs() {
        return Stream.of(
                Arguments.of(0, "Invalid"),
                Arguments.of(1, "One"),
                Arguments.of(2, "Two"),
                Arguments.of(3, "Three"),
                Arguments.of(4, "Invalid")
        );
    }

    // END mySwitch Tests

    // START myTernary Tests

    @ParameterizedTest
    @MethodSource("myTernaryArgs")
    void testMyTernary(int argument, String expected) {
        assert expected.equals(Conditional.myTernary(argument));
    }

    private static Stream<Arguments> myTernaryArgs() {
        return Stream.of(
                Arguments.of(0, "whole number"),
                Arguments.of(-1, "negative integer"),
                Arguments.of(2, "whole number")
        );
    }

    // END myTernary Tests

}
