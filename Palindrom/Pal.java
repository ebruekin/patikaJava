package Palindrom;

import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("enter a number");
        int num = inp.nextInt();

        int original = num;
        int reverse = 0;
        int rem;

        while(num != 0){
            rem = num % 10;
            reverse = (reverse*10) + rem;
            num = num /10; 
        }

        if(reverse == original){
            System.out.println(original + " is Palindrom");
        }else{
            System.out.println(original + " is not Palindrom");
        } 
        inp.close();         
    }
}
