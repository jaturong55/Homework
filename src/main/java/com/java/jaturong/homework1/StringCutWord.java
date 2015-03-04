package com.java.jaturong.homework1;
import java.util.Scanner;
public class StringCutWord {
    public static void main(String[] args) {
        String word;
        Scanner scan = new Scanner(System.in);
        System.out.println("Plese input word : ");
        word = scan.nextLine();
        
         for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
           if(c != '-'){
               System.out.print(c);
           }
           else{
               System.out.print("\n");
           } 
        }   
    }
}
