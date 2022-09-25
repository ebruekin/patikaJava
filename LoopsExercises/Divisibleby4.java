import java.util.Scanner;
public class Divisibleby4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,toplam = 0;

        do{
            System.out.println("Sayi giriniz");
            n = input.nextInt();
            if(n % 2 == 0 && n % 4 == 0){
                toplam += n;
            }
        } while(n % 2 == 0);

        System.out.println("toplam " + toplam);
        input.close();
    }
}
