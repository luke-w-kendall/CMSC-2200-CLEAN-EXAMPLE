package edu.ben.lab2;

public class Conditional {

    public static void main(String... args) {
        System.out.println(myConditional(0)); // Should print "0"
        System.out.println(myConditional(-1)); // Should print "Negative"
        System.out.println(myConditional(3)); // Should print "Positive"
        System.out.println();
        System.out.println(mySwitch(0)); // Should print "Invalid"
        System.out.println(mySwitch(1)); // Should print "One"
        System.out.println(mySwitch(2)); // Should print "Two"
        System.out.println(mySwitch(3)); // Should print "Three"
        System.out.println(mySwitch(4)); // Should print "Invalid"
        System.out.println();
        System.out.println(myTernary(0)); // Should print "whole number"
        System.out.println(myTernary(-1)); // Should print "negative integer"
        System.out.println(myTernary(3)); // Should print "whole number"
    }

    protected static String myConditional(int value) {
        String result;
        if (value > 0) {
            result = "Positive";
        } else if (value == 0) {
            result = "0";
        } else {
            result = "Negative";
        }

        return result;
    }

    protected static String mySwitch(int value) {
        switch (value) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            default:
                return "Invalid";
        }
    }

    protected static String myTernary(int value) {
        return value < 0 ? "negative integer" : "whole number";
    }

}
