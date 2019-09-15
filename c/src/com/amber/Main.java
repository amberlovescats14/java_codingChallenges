package com.amber;

public class Main {

    public static void main(String[] args) {
        new KilometersToMiles().printConversion(1.5);

        var cm = new Overloading().calcFeetAndInchesToCentimeters(157);
        System.out.println(cm);

        var s = new SecondsAndMinutes().getDurationString(7322);
        System.out.println(s);

        new MegaBytes().printMegaBytesAndKiloBytes(2500);
    }
}
