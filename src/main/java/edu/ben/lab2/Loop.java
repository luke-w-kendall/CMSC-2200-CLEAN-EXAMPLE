package edu.ben.lab2;

public class Loop {

    public static void main(String... args) {

        int[] sampleOne = new int[]{1, 2, 3, 4, 5, 6};
        int[] sampleTwo = new int[]{20, 25, 30, 60};
        int[] sampleThree = new int[]{1};

        System.out.println(myForLoop(sampleOne)); // Should print 1
        System.out.println(myForLoop(sampleTwo)); // Should print 4
        System.out.println(myForLoop(sampleThree)); // Should print 0
        System.out.println();
        System.out.println(myEnhancedForLoop(sampleOne)); // Should print 2
        System.out.println(myEnhancedForLoop(sampleTwo)); // Should print 2
        System.out.println(myEnhancedForLoop(sampleThree)); // Should print 0
        System.out.println();
        System.out.println(myWhileLoop(sampleOne)); // Should print 15
        System.out.println(myWhileLoop(sampleTwo)); // Should print 75
        System.out.println(myWhileLoop(sampleThree)); // Should print 0
    }

    /**
     * Note: Must use a for loop
     *
     * @param values The array to be iterate through
     * @return The count of elements in the values array that are greater than 5
     */
    protected static int myForLoop(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 5) {
                count++;
            }
        }
        return count;
    }

    /**
     * Note: Must use and enhanced for loop
     *
     * @param value The array to iterate through
     * @return the count of elements in value that are divisible by 3
     */
    protected static int myEnhancedForLoop(int[] value) {
        int count = 0;
        for (int v : value) {
            if (v % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Note: Must use a while loop
     *
     * @param values The array of values to iterate through.
     * @return the sum of all ints in values that are greater than 3 until the sum is greater than 50
     */
    protected static int myWhileLoop(int[] values) {
        int sum = 0;
        int i = 0;
        while (sum < 50 && i < values.length) {
            if (values[i] > 3) {
                sum += values[i];
            }
            i++;
        }
        return sum;
    }

}
