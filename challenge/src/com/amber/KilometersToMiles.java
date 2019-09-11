package com.amber;

public class KilometersToMiles {
    public long toMilesPerHour(double kilometersPerHour){
        double conversion = kilometersPerHour * .621371;
        if(kilometersPerHour < 0) return -1;
        return Math.round(conversion);
    }
    public void printConversion(double kilometersPerHour){
        long round = toMilesPerHour(kilometersPerHour);
        if(round == -1) System.out.println("Invalid Value");
        else System.out.println(kilometersPerHour + " km/h = " + round+" mi/h");
    }
}
