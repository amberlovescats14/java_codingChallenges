package com.amber;

public class Main {

    public static void main(String[] args) {
        new KilometersToMiles().printConversion(1.5);

        var cm = new ToCentimeters().calcFeetAndInchesToCentimeters(157);
        System.out.println(cm);
    }

}
