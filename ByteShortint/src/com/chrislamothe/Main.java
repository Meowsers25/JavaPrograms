package com.chrislamothe;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
//	    int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;
//        int myTotal = (myMinValue / 2);
//        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
//        byte myByteValue = -128;
//        byte myNewByteValue = (byte) (myByteValue / 2);
//        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
//        short myShortValue = 32767;
//        short myNewShortValue = (short) (myNewShortValue / 2);

        // long has a width of 64
//        long myLongValue = 100L;

        byte newByte = 120;
        short newShort = 30000;
        int newInt = 25;
        long newLong = 50000L + 10L * (newByte + newShort + newInt);
        System.out.println("newLong = " + newLong);
    }
}
