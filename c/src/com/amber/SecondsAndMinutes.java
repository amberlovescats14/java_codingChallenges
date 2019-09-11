package com.amber;

public class SecondsAndMinutes {
    public String getDurationString(int minutes, int seconds){
        if(!(minutes >= 0)) return "Invalid value";
        if(!(seconds >= 0) || !(seconds <= 59)) return "Invalid value";
        double totalMinutes = (seconds / 60) + minutes;
        int amountOfHours = (int) (totalMinutes / 60);
        int amountOfMinutes = (int) ((totalMinutes % 60) % 60);
        int amountOfSeconds = (int) ((amountOfMinutes % 60) % 60);
        return amountOfHours + "h " + amountOfMinutes + "m " + amountOfSeconds + "s";

    }

    public String getDurationString(int seconds){
        if(!(seconds >= 0) ) return "Invalid value";
        int min = (int) (seconds / 60);
        int sec = (int) (seconds % 60);
        return getDurationString(min, sec);
    }
}
