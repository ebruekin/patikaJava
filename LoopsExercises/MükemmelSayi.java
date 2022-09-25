import java.util.Scanner;
public class MükemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,toplam=0;
        
        System.out.print("enter a number = ");
        n = input.nextInt();

        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                toplam +=i;
            }
        }

        if(toplam == n){
            System.out.println(n + " Mükemmel Sayi");
        }
        else{
            System.out.println(n + " Mükemmel sayi degildir");
        }
        
        input.close();      
    }
}
