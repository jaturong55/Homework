package com.java.jaturong.homework1;
import com.sun.corba.se.spi.orbutil.fsm.Input;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
    String input;
    Scanner scan = new Scanner(System.in);
        System.out.println("Plese input message");
    input = scan.nextLine();
        System.out.println("Total word : "+input.length());
    }
}
