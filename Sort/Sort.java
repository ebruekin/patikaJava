package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinin boyutu = ");
        int n = inp.nextInt();

        int[] arr  = new int[n];

        for(int i=0 ; i < n; i++){
            System.out.print("Dizinin elemanlarını giriniz = ");
            arr[i] = inp.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        inp.close();
    }



}



        
        























