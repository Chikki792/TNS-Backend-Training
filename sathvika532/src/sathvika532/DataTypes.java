package sathvika532;

public class DataTypes{
    public static void main(String[] args) {
        // Primitive Data Types
        byte a = 100;        // Byte
        short b = 5000;      // Short
        int c = 55444484;               // Integer
        float d = 5.99f;   // Floating point number
        char e = 'D';        // Character
        boolean f = true;      // Boolean
        double g = 19.99;    // Double precision floating point number

        // Non-Primitive Data Types
        String h = "Hello";    // String
        int[] arr = {1, 2, 3, 4, 5}; // Array


        // Displaying the values
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("Integer: " + c);
        System.out.println("Float: " + d);
        System.out.println("Character: " + e);
        System.out.println("Boolean: " + f);
        System.out.println("Double: " + g);
        System.out.println("String: " + h);
        for(int i : arr) {
            System.out.println("Array Element: " + i);
        }

    }
}
