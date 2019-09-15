package com.amber;

public class MegaBytes {
    public void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0) System.out.println("Invalid Value");
        int mega = kiloBytes / 1000;
        int remainder = kiloBytes % 1000;
        System.out.println(kiloBytes + " KB = " + mega + " MB and " + remainder +  " KB");
    }

}
