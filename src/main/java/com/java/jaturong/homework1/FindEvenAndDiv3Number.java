package com.java.jaturong.homework1;
import java.util.Scanner;
public class FindEvenAndDiv3Number {
    public static void main(String[] args) {
        int n,sum = 0,count = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Plese input number of n");
        n = scan.nextInt();
        
        for(int i = 1 ; i <= n ; i++){
            if(i % 2 == 0){
                System.out.println("Event Result = "+i);
            }
            if(i % 3 == 0){
               sum++; 
            }
        }
         System.out.println("Number of div 3 = 0 have : "+sum);      
    }       
}
    

