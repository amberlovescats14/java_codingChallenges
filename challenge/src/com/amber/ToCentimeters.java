package com.amber;

public class ToCentimeters {

    public String calcFeetAndInchesToCentimeters(double feet, int inches){
        double cmValue = 2.54;
        if(!(feet >= 0) ) return "-1";
        if(!(0 <= inches && inches <= 12) ) return "-1";
        double cm = (feet * 12) * cmValue;
        cm += inches * 2.54;
        return  feet + "ft, " + inches + " inches = " + cm;
    }
    public String calcFeetAndInchesToCentimeters( int inches){
        // we are just going to find how many whole feel are in this
        //and pass the remainder as inches param
        if(!(0 <= inches ) ) return "-1";
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, (int) remainingInches);
    }
}
