package com.ab.core.enumeration;

/**
 * @author Arpit Bhardwaj
 *
 *  * Enum in Java are reference types like class or interface and you can define constructor, methods and variables inside java Enum
 *  * Enums in Java are type-safe and has their own namespace. It means your enum will have a type for example "Currency" in below example and you can not assign any value other than specified in Enum Constants.
 *  *
 *  Enum constants are implicitly static and final and can not be changed once created.
 *  The constructor of enum in java must be private any other access modifier will result in compilation error.
 *
 *  You can specify values of enum constants at the creation time
 *  But for this to work you need to define a member variable and a constructor because PENNY (1) is actually calling a constructor which accepts int value
 */
public enum  Currency implements Runnable{

    PENNY(1) {
        @Override
        public String color() {
            return "Copper";
        }
    },
    NICKLE(2){
        @Override
        public String color() {
            return "Bronze";
        }
    },
    DIME(3){
        @Override
        public String color() {
            return "Silver";
        }
    },
    QUARTER(4) {
        @Override
        public String color() {
            return "Gold";
        }
    };

    private int value;

    Currency(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String str = null;
        switch (this){
            case PENNY:
                str = "Penny: " + value;
                break;
            case NICKLE:
                str = "Nickle: " + value;
                break;
            case DIME:
                str = "Dime: " + value;
                break;
            case QUARTER:
                str = "Quarter: " + value;
        }
        return str;
    }
    public abstract String color();
    @Override
    public void run() {
        System.out.println("Running Thread");
    }
}
