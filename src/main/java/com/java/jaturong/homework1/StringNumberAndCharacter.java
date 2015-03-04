package com.java.jaturong.homework1;
import java.util.Scanner;
public class StringNumberAndCharacter {
      public static void main(String[] args) {
        String concath = "",number = "";
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.print("input Sting : ");
        input = scan.nextLine();
        
       for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isDigit(c)){
                number = number+c;
            }
            else{
                concath = concath+c;
            }
        }
        System.out.println("String = "+concath);
        System.out.println("Number = "+number);
    }          
}
