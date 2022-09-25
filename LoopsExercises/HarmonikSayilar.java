import java.util.Scanner;
public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz..");
        int n = input.nextInt();
        input.close();
        
        double harm = 0;
        for(double i=1;i<=n;i++){
            harm += 1/i;
        }
        System.out.println("harmonik = " + harm);
    }    
}
