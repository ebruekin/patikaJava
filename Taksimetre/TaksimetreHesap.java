import java.util.Scanner;
public class TaksimetreHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        double tutar;
        System.out.println("gidilecek km giriniz: ");
        km = input.nextInt();

        tutar = 10 + km*2.20;
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println(tutar);
        input.close();
    }
}
