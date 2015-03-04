package com.java.jaturong.homework1;
import java.util.Scanner;
public class FindMaxValue {
    public static void main(String[] args) {
    int x,y,z;
    Scanner scanx = new Scanner(System.in);
    Scanner scany = new Scanner(System.in);
    Scanner scanz = new Scanner(System.in);
     
    System.out.println("Plese input number x : ");
    x = scanx.nextInt();
    System.out.println("Plese input number y : ");
    y = scany.nextInt();
    System.out.println("Plese input number z : ");
    z = scanz.nextInt();
    
    if(x > y && x > z){
        System.out.println(x);
    }
    else if(y > x && y> z){
        System.out.println(y);
    }
    else{
        System.out.println(z);
    }    
    } 
}
