import java.util.Scanner;
public class KdvHesap{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double para,kdvtutar;
        System.out.println("Para degeri giriniz:");
        para = input.nextDouble();
        kdvtutar = para > 1000 ? 0.08 : 0.18;
        System.out.println("kdvli tutar: " + ((para*kdvtutar)+para));
        System.out.println("kdv tutarı: " + (para*kdvtutar));
        input.close();
        
        
    }

}