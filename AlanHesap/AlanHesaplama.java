import java.util.Scanner;
public class AlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double alan,u;
        
        System.out.println("1. kenar uzunluğu giriniz: ");
        a = input.nextInt();

        System.out.println("2. kenarın uzunluğunu giriniz: ");
        b= input.nextInt();

        System.out.println("3. kenar uzunluğunu giriniz:");
        c = input.nextInt();

        u = (a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("alan = " + alan);

        input.close();





    }
}
