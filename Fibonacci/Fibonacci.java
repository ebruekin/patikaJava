package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        int maxN = 0;
        int prevN = 0;
        int nextN = 1;

        System.out.println("How many number you want in fibonacci = ");

        Scanner inp = new Scanner(System.in);
        maxN = inp.nextInt();

        System.out.println("Fib series of " + maxN + " number: ");

        for(int i=1 ; i < maxN ; ++i ){

            System.out.print(prevN+" ");
            int sum = prevN + nextN;
            prevN = nextN;
            nextN = sum;
        }        



    }
}
