import java.util.Scanner;
public class BasamakToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi giriniz..");
        int n = input.nextInt();
        input.close();

        int a = Integer.toString(n).length();
        
        int res = 0;

        for(int i=0 ; i<a ; i++){
            res += n%10;
            n = Math.floorDiv(n, 10);
        }        
        System.out.println("res.." + res);      
    }
}
