import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n,r,comb,nf=1,rf=1,nrf=1;
        
        System.out.println("Kümenin eleman sayisini giriniz = ");
        n = input.nextInt();

        System.out.println("r elamanlarini giriniz = ");
        r = input.nextInt();
        
        input.close();

        for(int i = 1 ; i <= n ; i++){
            nf = nf*i;            
        }        
        for(int j = 1 ; j <= r ; j++){
            rf = rf*j;            
        }        
        for(int k = 1; k <= n-r;k++){
            nrf = nrf *k;           
        }      
        
        comb = nf/(rf*nrf);
        System.out.println(comb);
    }
}
