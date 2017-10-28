package com.chrislamothe;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
	    int myIntValue = 5 / 3;
	    //float myFloatValue = (float) 5.4; //better practice f after number
        //width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //width of double = 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double newDouble = 10d;
        double convertedDouble = newDouble * 0.45359237d;
        System.out.println(newDouble + " pounds equals " + convertedDouble + " kilograms");
    }
}
