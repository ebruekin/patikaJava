import java.util.Scanner;
public class PowerOf4and5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sayi giriniz =");
        int num = input.nextInt();
        
        input.close();
        
        for(int i = 1 ;  i <= num ; i *= 4){
            System.out.println("Power of 4 = " + i );
        }

        for(int i = 1 ; i <= num ; i *= 5){
            System.out.println("power of 5 =" + i);
        }
    }
}
