import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,a,dilimAlan;
        double pi = 3.14;

        
        System.out.println("Daire için r giriniz: ");
        r = input.nextDouble();

        System.out.println("Daire için merkez açı ölçüsü giriniz: ");
        a = input.nextDouble();

        dilimAlan = (pi*(r*r)*a) / 360;
        
        System.out.println(dilimAlan);
        input.close();

    }
}
