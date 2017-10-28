package com.chrislamothe;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //int
        //long
        //double
        //float
        //char
        //boolean

        String myString = "This is a string. ";
        System.out.println("myString is equal to " + myString);
        myString = myString + "And this is more.";
        System.out.println(myString);
        myString = myString + "\u0586";
        System.out.println(myString);

        String numString = "244.35 ";
        numString = numString + "32.50";
        System.out.println(numString);

        String lastString = "10 ";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubNum = 125.55;
        lastString = lastString + " " + doubNum;
        System.out.println(lastString);

        

    }
}
