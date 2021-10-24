package edu.ben.lab2;

public class Variable {

    public static void main(String... args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }

        boolean bool = true;
        System.out.println(bool);

        byte b = 1;
        System.out.println(b);

        short s = 20;
        System.out.println(s);

        int i = 300;
        System.out.println(i);

        long l = 9000;
        System.out.println(l);

        float f = 3.5f;
        System.out.println(f);

        double d = 36.60;
        System.out.println(d);

        char symbol = 'a';
        System.out.println(symbol);

        String str = "Hello World!";
        System.out.println(str);


    }

}
