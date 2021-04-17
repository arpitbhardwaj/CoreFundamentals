package com.ab.core.controlflow;

/**
 * @author Arpit Bhardwaj
 *
 * Whichever case matches the all code after it ignore case and default get executed till end of switch.
 * In order to stop it break key word is required whereever you want to break.
 *
 * The order of branch doesn't matter
 *
 * Supported Types
 * char, byte, short, int, Character, Byte, Short, Integer, String, or an enum
 *
 * Switch test value
 * Any expression that returns a value (of supported type)
 *
 * Branch Case Value
 * Any Constant Expression
 * or Value must be resolved at compile time
 */
public class SwitchCase {
    public static void main(String[] args) {
        char sign = '+';
        switch (sign){
            case '+':
                System.out.println("Positive1");
            case '-':
                System.out.println("Negative1");
            case '*':
                System.out.println("Multiply1");
            case '/':
                System.out.println("Divide1");
            default:
                System.out.println("Default1");
        }

        sign = '-';
        switch (sign){
            case '+':
                System.out.println("Positive2");
            case '-':
                System.out.println("Negative2");
            case '*':
                System.out.println("Multiply2");
            case '/':
                System.out.println("Divide2");
                break;
            default:
                System.out.println("Default2");
        }

        sign = '&';
        switch (sign){
            case '+':
                System.out.println("Positive3");
            default:
                System.out.println("Default3");
            case '-':
                System.out.println("Negative3");
            case '*':
                System.out.println("Multiply3");
            case '/':
                System.out.println("Divide3");
        }

        char a = 'a';
        byte b = 2;
        short c = 3;
        int d = 1;
        long e = 2; //not allowed
        double f = 4; //not allowed
        float g = 5; // not allowed
        boolean h = true; // not allowed

        switch (a){

        }

        int iVal = 10;
        final int even = 0;
        final int odd = 1;
        switch (iVal % 2){
            case even:
            //case even + 1://compile time error as it duplicates with odd value
            case even + 2:
            case odd:
            default:
        }

        int items = 100;
        final int maxItems = readMaxItems();//even though maxItems is final but still the value is not resolved during compile time

        switch (items){
            //case maxItems://compile error
            default:
        }
    }

    private static int readMaxItems() {
        return 0;
    }
}